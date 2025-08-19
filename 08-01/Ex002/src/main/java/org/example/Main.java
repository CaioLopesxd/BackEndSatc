                                        package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ex01();
        Ex02();
        Ex03();
    }

    public static void Ex01(){
        Random random = new Random();
        String senha = "";
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < 8; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());

            senha = senha + caracteres.charAt(indiceAleatorio);
        }

        System.out.println("Senha gerada: " + senha.toString());
    }
    public static void Ex02() {
        Random random = new Random();
        String[] nomes      = {"Caio","Gustavo","Calebe","Lucas"};
        String[] sobrenomes = {"Dos Santos","Lopes","Silva","Carvalho"};
        String[] posicoes   = {"Atacante","Goleiro","Zagueiro","Volante"};
        String[] times      = {"Inter Nacional","Gremio","Criciúma","Figueirense"};

        String jNome      = nomes[random.nextInt(nomes.length)];
        int    jIdade     = random.nextInt(40);
        String jSobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
        String jTime      = times[random.nextInt(times.length)];
        String jPosicao   = posicoes[random.nextInt(posicoes.length)];

        System.out.println(jNome +  " é um futebolista brasileiro de " + jIdade + " anos que atua como " + jPosicao + ". Atualmente defende o " + jTime);
    }

    public static void Ex03() {
        Random random = new Random();
        String[] tipos = {"Agua","Fogo","Gelo","Dragão","Psiquico","Grama","Veneno","Lutador","Escuridão","Fantasma","Terra","Metal"};
        String[] pokemons = {"Blastoise" ,"Vaporeon", "Lapras", "Gyarados", "Suicune", "Charizard", "Arcanine", "Ninetales", "Entei", "Flareon", "Lapras", "Articuno", "Weavile", "Glaceon", "Mamoswine", "Dragonite", "Rayquaza", "Salamence", "Garchomp", "Haxorus", "Alakazam", "Mewtwo", "Gardevoir", "Espeon", "Metagross", "Venusaur", "Sceptile", "Leafeon", "Torterra", "Rillaboom", "Arbok", "Crobat", "Gengar", "Salazzle", "Toxicroak", "Machamp", "Lucario", "Hitmonlee", "Conkeldurr", "Gallade", "Umbreon", "Tyranitar", "Zoroark", "Absol", "Greninja", "Gengar", "Mimikyu", "Dusknoir", "Chandelure", "Spiritomb", "Sandslash", "Groudon", "Donphan", "Flygon", "Excadrill", "Steelix", "Metagross", "Lucario", "Scizor", "Aegislash"};
        System.out.println("Quantos pokemons você deseja gerar?");

        Scanner scan = new Scanner(System.in);
        int qtde = scan.nextInt();

        for (int i = 0; i < qtde; i++) {
            int nivel =  random.nextInt(50);
            String rPokemon =  pokemons[random.nextInt(pokemons.length)];
            String rTipo =  tipos[random.nextInt(tipos.length)];
            System.out.println(rPokemon + " é um Pokémon do tipo " + rTipo + " de nivel " + nivel);
        }
    }
}