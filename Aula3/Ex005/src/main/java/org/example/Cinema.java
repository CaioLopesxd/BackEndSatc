package org.example;

import java.util.List;

public class Cinema {
    List<Filme> filmesDisponiveis;
    List<Ingresso> ingressosDisponiveis;
    public Cinema() {
    }
    public void adicionarFilme(Filme filme){
        this.filmesDisponiveis.add(filme);
    }
    public void venderIngresso(Ingresso ingresso){
        this.ingressosDisponiveis.add(ingresso);
    }
    public Filme procuraFilme(String nome){
        Filme filme = null;
        for(Filme filmeDisponivel : this.filmesDisponiveis){
            if(filmeDisponivel.nome.equals(nome)){
                filme = filmeDisponivel;
                break;
            }
        }
        return filme;
    }
}
