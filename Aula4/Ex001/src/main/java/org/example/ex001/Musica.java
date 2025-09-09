package org.example.ex001;

public class Musica {
    public int id;
    public String nome;
    public String artista;
    public String album;
    public int duracao;
    public String genero;
    Musica(int id, String nome, String artista, String album, int duracao, String genero){
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.album = album;
        this.duracao = duracao;
        this.genero = genero;
    }
}