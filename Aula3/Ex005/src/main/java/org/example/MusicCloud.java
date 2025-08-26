package org.example;

import java.util.Vector;

public class MusicCloud {
    Vector<Musica> musicasDisponiveis = new Vector<>();
    public MusicCloud() {
    }
    public void adicionarMusica(Musica musica){
        this.musicasDisponiveis.add(musica);
    }
    public void listarMusicas(){
        for(Musica musica : this.musicasDisponiveis){
            System.out.println(musica.Artista + " - " + musica.Titulo);
        }
    }
    public boolean pesquisarMusica(String nomeMusica, String nomeArtista){
        for(Musica musica : this.musicasDisponiveis){
            if(musica.Titulo.equals(nomeMusica) && musica.Artista.equals(nomeArtista)){
                return true;
            }
        }
        return false;
    }

}
