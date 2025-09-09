package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import org.example.MusicCloud;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ex05();
    }
    public static void Ex01(){
        Vector<Personagem> inimigos = new Vector<>();

        inimigos.add(new Personagem("Orc",100,10));
        inimigos.add(new Personagem("Goblin",50,5));
        inimigos.add(new Personagem("Lobo",75,15));
        inimigos.add(new Personagem("Cavaleiro",200,20));
        inimigos.add(new Personagem("Dragao",500,50));

        Personagem jogador = new Personagem("Steve",100,20);

        Random random = new Random();

        jogador.atacar(inimigos.elementAt(0));
        jogador.atacar(inimigos.elementAt(0));
        jogador.atacar(inimigos.elementAt(0));
        jogador.atacar(inimigos.elementAt(0));
        jogador.atacar(inimigos.elementAt(0));
        jogador.atacar(inimigos.elementAt(1));
        jogador.atacar(inimigos.elementAt(1));
        jogador.atacar(inimigos.elementAt(1));
        inimigos.elementAt(4).atacar(jogador);
        inimigos.elementAt(4).atacar(jogador);

        System.out.println("*** FIM DO JOGO ***");
    }
    public static void Ex02() {
        Vector<Barco> barcos = new Vector<>();
        barcos.add(new Barco("Barco 1",2));
        barcos.add(new Barco("Barco 2",5));
        barcos.add(new Barco("Barco 3",7));
        barcos.add(new Barco("Barco 4",12));
        barcos.add(new Barco("Barco 5",20));

        BasePorto portoGrande = new PortoGrande("Porto Grande");
        PortoPiqueno portoPiqueno = new PortoPiqueno("Porto Piqueno");

        for(Barco barco : barcos){
            if(portoPiqueno.atracarBarco(barco)){
                continue;
            }
            portoGrande.atracarBarco(barco);
        }
        portoPiqueno.getBarcos();
        portoGrande.getBarcos();
    }

    public static void Ex03() {

        MusicCloud musicCloud = new MusicCloud();
        musicCloud.adicionarMusica(new Musica("Avenged Sevenfold", "Bat Country"));
        musicCloud.adicionarMusica(new Musica("Avenged Sevenfold", "Afterlife"));
        musicCloud.adicionarMusica(new Musica("Avenged Sevenfold", "Hail to the King"));
        musicCloud.adicionarMusica(new Musica("Avenged Sevenfold", "Nightmare"));
        musicCloud.adicionarMusica(new Musica("Avenged Sevenfold", "A Little Piece of Heaven"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da playlist: ");
        String nomePlaylist = scanner.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nome da musica");
        String nomeMusica = scanner2.nextLine();
        System.out.println("Artista");
        String nomeArtista = scanner2.nextLine();

        if(musicCloud.pesquisarMusica(nomeMusica, nomeArtista)){
            playlist.adicionarMusica(new Musica(nomeMusica, nomeArtista));
        }

        System.out.println("Musicas adicionadas na playlist");
        playlist.listarMusicas();

    }
    public static void Ex04() {
        Mybook mybook = new Mybook();
        Fotogram fotogram = new Fotogram();
        AnyTube anyTube = new AnyTube();

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Digite o titulo: " );
        String titulo = scanner.nextLine();
        System.out.println("Descrição do post:");
        String descricao = scanner.nextLine();
        System.out.println("Tipo de post: (texto, imagem, video)");
        String tipo = scanner.nextLine();

        Postagem postagem = new Postagem(titulo, descricao, tipo);

        if(tipo.equals("texto")){
            mybook.compartilharPostagem(postagem);
            fotogram.compartilharPostagem(postagem);
            anyTube.compartilharPostagem(postagem);
        }else if(tipo.equals("imagem")){
            mybook.compartilharImagem(postagem);
            fotogram.compartilharImagem(postagem);
            anyTube.compartilharImagem(postagem);
        }else{
            mybook.compartilharVideo(postagem);
            fotogram.compartilharVideo(postagem);
            anyTube.compartilharVideo(postagem);
        }
    }
    public static void Ex05() {
        Cinema cinema = new Cinema();
        cinema.adicionarFilme(new Filme(15.0, "Avatar", 12));
        cinema.adicionarFilme(new Filme(20.0, "Star Wars", 14));
        cinema.adicionarFilme(new Filme(18.0, "Toy Story", 0));
        cinema.adicionarFilme(new Filme(25.0, "Matrix", 16));
        cinema.adicionarFilme(new Filme(22.0, "Vingadores", 12));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o nome do filme: ");
        String nomeFilme = scanner.nextLine();



        Cliente cliente = new Cliente("Caio", idade);
        Filme filme = cinema.procuraFilme(nomeFilme);



    }
}