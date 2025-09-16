package org.example.ex001;

import java.util.UUID;

public class Livro {
    private UUID uid;
    private String titulo;
    private String autor;
    private boolean disponivel;

    Livro(String titulo, String autor){
        this.uid = UUID.randomUUID();
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
    public UUID getUid() {
        return uid;
    }
    public String getTitulo(){
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
