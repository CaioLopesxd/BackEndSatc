package org.example;

public class Postagem {
    String titulo;
    String descricao;
    String tipo;
    public Postagem(String titulo, String descricao, String tipo) {
        this.titulo = titulo;
        this.descricao = descricao;
        validaTipo(tipo);
    }
    public String getTitulo() {
        return titulo;
    }
    public void validaTipo(String tipo){
        if(tipo.equals("texto") || tipo.equals("imagem") || tipo.equals("video")){
            this.tipo = tipo;
        }else{
            System.out.println("Tipo Incorreto");
        }
    }
}
