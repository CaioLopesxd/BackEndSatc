package org.example;

import java.util.Vector;

public class AnyTube implements PlataformaSocial{
    public AnyTube() {
    }
    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Postagem compartilhado com sucesso no Fotogram");
    }

    @Override
    public void compartilharImagem(Postagem postagem){
        System.out.println("Erro ao compartilhar imagem no AnyTube");
    }

    @Override
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Postagem compartilhado com sucesso no Fotogram");
    }
}
