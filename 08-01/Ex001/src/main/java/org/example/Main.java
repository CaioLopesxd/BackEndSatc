package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ex1();
        Ex2();
        Ex3();
        Ex4();
        Ex5();
        Ex6();
        Ex7();
        Ex8();
    }

    //1
    public static void Ex1(){
        System.out.println("Bem-vindo ao Sistema de Geração de Jogadores!");
    }

    //2
    public static void Ex2(){
        String Nome = "Mariana Silva ";
        String Cargo = "Analista de Sistemas ";
        double Salario = 4500.00;

        System.out.println("Nome:" + Nome);
        System.out.println("Cargo: " + Cargo);
        System.out.println("Salario: R$" + String.valueOf(Salario));
    }

    //3
    public static void Ex3(){
        String Produto = "Teclado";
        String Codigo = "12345";
        double Preco = 99.90;
        boolean Promocao = true;
        System.out.println("Produto: " + Produto);
        System.out.println("Codigo: " + Codigo);
        System.out.println("Preco: R$" + String.valueOf(Preco));
        System.out.println("Promocao: " + String.valueOf(Promocao));
    }

    //4
    public static void Ex4(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira o Valor do produto.");
        double Valor = myObj.nextDouble();
        if (Valor >= 100){
            double ValorDescontado = Valor - (Valor * 0.1);
            System.out.println("Valor com desconto: R$" + String.valueOf(ValorDescontado));
        }else {
            System.out.println("Valor sem desconto: R$" + String.valueOf(Valor));
        }
    }

    //5
    public static void Ex5(){
        System.out.println("Insira sua Idade");
        Scanner myObj2 = new Scanner(System.in);
        int Idade = myObj2.nextInt();
        if(Idade < 12){
            System.out.println("Categoria: Infantil");
        }else if(Idade >= 12 && Idade <= 17){
            System.out.println("Categoria: Juvenil");
        }else{
            System.out.println("Categoria: Adulto");
        }
    }
    //6
    public static void Ex6(){
        int Notas[] = {7,8,6,9,10};
        int Total = 0;
        for (int i = 0; i < Notas.length; i++) {
            Total += Notas[i];
        }
        double Media = Total / Notas.length;
        System.out.println("Media: " + String.valueOf(Media));
    }

    //7
    public static double calcularImc(double altura, double peso) {
        return (peso / (altura * altura));
    }
    public static void Ex7(){
        System.out.println(calcularImc(1.75,70));
    }

    //8
    public static void Ex8(){
        String Nome2 = "Ana Maria Silva";
        System.out.println(Nome2.length());
        System.out.println(Nome2.toUpperCase());
        System.out.println(Nome2.contains("Silva"));
    }
}
