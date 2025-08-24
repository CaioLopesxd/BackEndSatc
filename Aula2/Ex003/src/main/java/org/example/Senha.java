package org.example;

import java.util.Random;
    public class Senha {

    private static Random random = new Random();
    private static String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private String senha = "";

    Senha(){
        for (int i = 0; i < 8; i++) {
            int indiceAleatorio = this.random.nextInt(caracteres.length());
            this.senha = this.senha + caracteres.charAt(indiceAleatorio);
        }
    }

    public String getSenha(){
        return this.senha;
    }
}
