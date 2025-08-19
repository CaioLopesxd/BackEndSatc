package org.example;

public class Jogador {
    private String nome;
    private String sobrenome;
    private int idade;
    private String posicao;
    private String time;

    Jogador(String nome,String sobrenome, int idade, String posicao, String time){
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.time = time;
    }

    void JogadorMensagem(){
        System.out.println(this.nome +  " é um futebolista brasileiro de " + this.idade + " anos que atua como " + this.posicao + ". Atualmente defende o " + this.time);
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("idade deve ser positivo");
            return;
        }
        this.idade = idade;
    }
}
