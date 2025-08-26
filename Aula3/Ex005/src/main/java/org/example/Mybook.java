package org.example;

import java.util.Vector;

public class Mybook implements PlataformaSocial{
    public Mybook() {
    }
    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Video compartilhada com sucesso no Mybook");
    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        System.out.println("Imagem compartilhada com sucesso no Mybook");
    }

    @Override
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Postagem compartilhada com sucesso no Mybook");
    }
}
