package org.example;

import java.util.Vector;

public class Playlist {
    Vector<Musica> musicas = new Vector<>();
    String nome;
    public Playlist(String nome) {
        this.nome = nome;
    }
    public void adicionarMusica(Musica musica){
        this.musicas.add(musica);
        System.out.println(musica.Artista + " - " + musica.Titulo + " adicionada a playlist " + this.nome);
    }
    public void listarMusicas(){
        for(Musica musica : this.musicas){
            System.out.println(musica.Artista + " - " + musica.Titulo);
        }
    }
}
