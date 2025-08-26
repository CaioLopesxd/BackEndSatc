package org.example;

public class PortoPiqueno extends BasePorto {
    public PortoPiqueno(String nome) {
        super(nome);
    }

    @Override
    public boolean atracarBarco(Barco barco){
        if(barco.getTamanho() <= 10){
            this.barcosAtracados.add(barco);
            return true;
        }
        return false;
    }
    @Override
    public void getBarcos() {
        for(Barco barco : this.barcosAtracados){
            System.out.println(barco.getNome() + " atracado no porto pequeno");
        }
    }
}
