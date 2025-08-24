package org.example;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
       Ex01();
       Ex02();
       Ex03();
    }
    public static void Ex01(){
        Vector<Senha> senhas = new Vector<>();

        for(int i = 0; i < 10; i++){
            Senha s = new Senha();
            senhas.add(s);
        }
        for(Senha s: senhas){
            System.out.println("Senha: " + s.getSenha());
        }
    }
    public static void Ex02(){
        String[] nomes      = {"Caio","Gustavo","Calebe","Lucas"};
        String[] sobrenomes = {"Dos Santos","Lopes","Silva","Carvalho"};
        String[] posicoes   = {"Atacante","Goleiro","Zagueiro","Volante"};
        String[] times      = {"Criciuma","Inter Nacional","Gremio","Figueirense"};

        Random random = new Random();
        Vector<Jogador> jogadores = new Vector<Jogador>();

        for(int i = 0; i < 11; i++){
            Jogador jogador = new Jogador(
                    nomes[random.nextInt(nomes.length)],
                    sobrenomes[random.nextInt(sobrenomes.length)],
                    random.nextInt(40),
                    posicoes[random.nextInt(posicoes.length)],
                    times[random.nextInt(times.length)]);
            jogadores.add(jogador);
        }

        for(Jogador jogador : jogadores){
            jogador.JogadorMensagem();
        }
    }
    public static void Ex03(){
        Random random = new Random();
        String[] tipos = {"Agua","Fogo","Gelo","Dragão","Psiquico","Grama","Veneno","Lutador","Escuridão","Fantasma","Terra","Metal"};
        String[] pokemons = {"Blastoise" ,"Vaporeon", "Lapras", "Gyarados", "Suicune", "Charizard", "Arcanine", "Ninetales", "Entei", "Flareon", "Lapras", "Articuno", "Weavile", "Glaceon", "Mamoswine", "Dragonite", "Rayquaza", "Salamence", "Garchomp", "Haxorus", "Alakazam", "Mewtwo", "Gardevoir", "Espeon", "Metagross", "Venusaur", "Sceptile", "Leafeon", "Torterra", "Rillaboom", "Arbok", "Crobat", "Gengar", "Salazzle", "Toxicroak", "Machamp", "Lucario", "Hitmonlee", "Conkeldurr", "Gallade", "Umbreon", "Tyranitar", "Zoroark", "Absol", "Greninja", "Gengar", "Mimikyu", "Dusknoir", "Chandelure", "Spiritomb", "Sandslash", "Groudon", "Donphan", "Flygon", "Excadrill", "Steelix", "Metagross", "Lucario", "Scizor", "Aegislash"};
        System.out.println("Quantos pokemons você deseja gerar?");

        Scanner scan = new Scanner(System.in);
        int qtde = scan.nextInt();

        Vector<Pokemon> Pokemons =  new Vector<Pokemon>();


        for (int i = 0; i < qtde; i++) {
          Pokemons.add(new Pokemon(
                       random.nextInt(50),
                       pokemons[random.nextInt(pokemons.length)],
                       tipos[random.nextInt(tipos.length)]));
        }
        for (Pokemon pokemon : Pokemons){
            System.out.println(pokemon.pokemon + " é um Pokémon do tipo " + pokemon.tipo + " de nivel " + pokemon.nivel);
        }
    }
}