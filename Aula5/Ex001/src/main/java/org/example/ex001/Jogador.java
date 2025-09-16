package org.example.ex001;

public class Jogador {

    private String nome;
    private int idade;
    private String posicao;

    Jogador(String nome, int idade, String posicao){
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", posicao='" + posicao + '\'' +
                '}';
    }
}
