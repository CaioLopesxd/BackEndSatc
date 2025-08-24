package org.example;

import java.time.Year;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    public Data(int dia, int mes, int ano) {
        if(validarData(dia, mes, ano)){
            this.mes = mes;
            this.ano = ano;
            this.dia = dia;
        }
    }
    private boolean validarData(int dia, int mes, int ano) {
        if (dia < 1 || mes < 1) {
            System.out.println("Data não pode conter valores negativos ou zero");
            return false;
        }

        if (mes > 12) {
            System.out.println("Mês não pode ser maior que 12");
            return false;
        }

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (dia > 31) {
                    System.out.println("Dia inválido para esse mês");
                    return false;
                }
                break;

            case 4: case 6: case 9: case 11:
                if (dia > 30) {
                    System.out.println("Dia inválido para esse mês");
                    return false;
                }
                break;

            case 2:
                if (Year.isLeap(ano)) {
                    if (dia > 29) {
                        System.out.println("Dia inválido para fevereiro em ano bissexto");
                        return false;
                    }
                } else {
                    if (dia > 28) {
                        System.out.println("Dia inválido para fevereiro em ano não bissexto");
                        return false;
                    }
                }
                break;
        }
        return true;
    }
    public void mostrarData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

}
