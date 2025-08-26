package org.example;

import java.util.Vector;

public class Fotogram implements PlataformaSocial{
    public Fotogram() {
    }
    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Video compartilhado com sucesso no Fotogram");
    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        System.out.println("Imagem compartilhada com sucesso no Fotogram");
    }

    @Override
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Erro ao postar Fotogram");
    }
}
