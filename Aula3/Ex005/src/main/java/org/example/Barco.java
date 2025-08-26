package org.example;

public class Barco {
    private String nome;
    private double tamanho;
    public Barco(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }
    public String getNome() {
        return nome;
    }
    public double getTamanho() {
        return tamanho;
    }
}
