package org.example;

public class Ingresso {
    Cliente cliente;
    Filme filme;
    int assento;
    Ingresso(Cliente cliente, Filme filme, int assento) {
        this.cliente = cliente;
        this.filme = filme;
        this.assento = assento;
    }
}
