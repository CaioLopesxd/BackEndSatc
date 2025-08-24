package org.example;

public class Fatura {
    private String numero;
    private String descricao;
    private Integer quantidade;
    private Double precoPorItem;

    Fatura(String numero, String descricao, Integer quantidade, Double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade < 0 ? 0 : quantidade;
        this.precoPorItem = precoPorItem < 0 ? 0 : precoPorItem;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Double getPrecoPorItem() {
        return precoPorItem;
    }
    public void setPrecoPorItem(Double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    public double getTotalFatura(){
        return this.quantidade * this.precoPorItem;
    }
}
