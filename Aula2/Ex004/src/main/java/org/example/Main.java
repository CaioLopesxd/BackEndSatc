package org.example;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Ex03();
    }

    public static void Ex01(){
        Vector<Fatura> faturaTeste =  new Vector<>();

        faturaTeste.add(new Fatura("1","Pão",10,0.65));
        faturaTeste.add(new Fatura("2","Leite",2,4.95));

        for(Fatura fatura : faturaTeste ){
            System.out.println("Codigo " + fatura.getNumero() +
                               " Nome " + fatura.getDescricao() +
                               " Quantidade " + fatura.getQuantidade() +
                               " Preço Unitario " + fatura.getPrecoPorItem() +
                               " Valor da Fatura " + fatura.getTotalFatura());
        }
    }

    public static void Ex02() {
        Vector<Empregado> empregados = new Vector<>();

        empregados.add(new Empregado("Ronaldo","Fenomeno",2300));
        empregados.add(new Empregado("Ronaldinho","Gaucho",2500));
        System.out.println("Salario Antes do Ajuste");
        for(Empregado empregado : empregados ){
            System.out.println(empregado.salarioAnual());
        }

        System.out.println("Salario Depois do Ajuste");
        for(Empregado empregado : empregados ){
            empregado.setSalario(empregado.getSalario() + (empregado.getSalario() * 0.1));
            System.out.println(empregado.salarioAnual());
        }
    }

    public static void Ex03() {
        Data data = new Data(-1,01,2025);
        Data data2 = new Data(29,13,24);
        Data data3 = new Data(30,02,24);
        Data data4 = new Data(32,03,24);
        Data data5 = new Data(29,02,24);
        data.mostrarData();
        data2.mostrarData();
        data3.mostrarData();
        data4.mostrarData();
        data5.mostrarData();
    }
}