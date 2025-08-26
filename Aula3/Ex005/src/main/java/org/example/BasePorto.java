package org.example;

import java.util.Vector;
public class BasePorto {
    private String nome;
    Vector<Barco> barcosAtracados = new Vector<>();

    public BasePorto(String nome) {
        this.nome = nome;
    }
    public boolean atracarBarco(Barco barco){
        this.barcosAtracados.add(barco);
        return true;
    }
    public void desatracarBarco(Barco barco){
        this.barcosAtracados.remove(barco);
    }
    public String getNome() {
        return this.nome;
    }
    public void getBarcos(){
        for(Barco barco : this.barcosAtracados){
            System.out.println(barco.getNome());
        }
    }
}
