package org.example.ex001;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class Ex001Controller {
    ArrayList<Jogador> jogadores = new ArrayList<>();
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    String[] nomes      = {"Caio","Gustavo","Calebe","Lucas"};
    String[] posicoes   = {"Atacante","Goleiro","Zagueiro","Volante","Reserva"};


    Random random = new Random();

    @PostMapping("/jogador")
    public String postString() {
        for(int i = 0; i < 11; i++){
            Jogador jogador = new Jogador(
                    nomes[random.nextInt(nomes.length)],
                    random.nextInt(40),
                    posicoes[random.nextInt(posicoes.length - 1)]
            );
            this.jogadores.add(jogador);
        }

        for(int i = 0; i < 5; i++){
            Jogador jogador = new Jogador(
                    nomes[random.nextInt(nomes.length)],
                    random.nextInt(40),
                    posicoes[4]
            );
            this.jogadores.add(jogador);
        }
        return "Jogadores criados com sucesso!";
    }


    @PutMapping("/jogador/{id}")
    public Jogador putJogador(@PathVariable int id,@RequestBody Jogador jogador) {
        for (int i = 0; i < jogadores.size(); i++) {
            if(i == id - 1 ){
                jogadores.set(i, jogador);
            }
        }
        return jogador;
    }


    @GetMapping("/jogador/principal")
    public List<Jogador> getJogadorPrincipais() {
        ArrayList<Jogador> jogadoresPrincipais = new ArrayList<>();

        for(Jogador jogador : jogadores){
            if(jogador.getPosicao().equals("Reserva")){
                continue;
            }
            jogadoresPrincipais.add(jogador);
        }
        return jogadoresPrincipais;
    }

    @GetMapping("/jogador/reservas")
    public List<Jogador> getJogadorReservas() {
        ArrayList<Jogador> jogadoresReservas = new ArrayList<>();

        for(Jogador jogador : jogadores){
            if(jogador.getPosicao().equals("Reserva")){
                jogadoresReservas.add(jogador);
            }
        }
        return jogadoresReservas;
    }

    @PostMapping("/livros")
    public ResponseEntity<String> postLivros() {
        String[] titulos = {
                "O Homem de Todos os Dias",
                "O Homem de Todas as Horas",
                "O Homem de Todas as Minhas Vidas",
                "O Homem que Nunca Dorme",
                "O Homem Além do Tempo",
                "O Homem das Sombras",
                "O Homem que Venceu o Medo",
                "O Homem dos Segredos",
                "O Homem da Cidade Perdida",
                "O Homem que Escutava o Vento"
        };

        String[] autores = {
                "Carlos Albuquerque",
                "Marina Silva",
                "João Pedro Martins",
                "Ana Clara Souza",
                "Rafael Monteiro",
                "Larissa Gomes",
                "Eduardo Farias",
                "Juliana Costa",
                "Felipe Andrade",
                "Isabela Duarte"
        };

        for(int i = 0; i < 10; i++){
            Livro livro = new Livro(titulos[i],autores[i]);
            this.livros.add(livro);
        }

        return ResponseEntity.ok("Livros criados com sucesso!");
    }
    @GetMapping("/livros")
    public List<Livro> getLivros() {
        return this.livros;
    }
    @GetMapping("/emprestados")
    public ResponseEntity<List<Livro>> getLivrosEmprestad() {
        ArrayList<Livro> livrosEmprestados = new ArrayList<>();
        for(Livro livro : livros){
            if(!livro.isDisponivel()){
                livrosEmprestados.add(livro);
            }
        }
        return ResponseEntity.ok(livrosEmprestados);
    }

    @PostMapping("/emprestados")
    public ResponseEntity<String> postEmprestimo(@RequestBody EmprestimoDto emprestimoDto) {
        System.out.println(emprestimoDto);
        for(Livro livro : livros){
            if(livro.getUid().equals(emprestimoDto.livroId())){
                livro.setDisponivel(false);
                break;
            }
        }
        Emprestimo emprestimo = new Emprestimo(emprestimoDto.livroId(),emprestimoDto.usuarioId());
        emprestimos.add(emprestimo);
        return ResponseEntity.ok("Emprestimo realizado com sucesso!");
    }
}

