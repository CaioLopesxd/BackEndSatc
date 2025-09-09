package org.example.ex001;

import java.util.List;
import java.util.Vector;

public class Playlist {
    public int id;
    public String nome;
    public List<Musica> musicas = new Vector<>();

    Playlist(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public void addMusica(Musica musica){
        this.musicas.add(musica);
    }
    public List<Musica> listarMusica(){
        return this.musicas;
    }
}
