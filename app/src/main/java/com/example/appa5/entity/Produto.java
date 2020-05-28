package com.example.appa5.entity;

import androidx.annotation.NonNull;

public class Produto {

    //CLasse Produtos com Atributos e Comportamentos

    private String nomeProduto;
    private double valor;
    private int quantidade;

    public Produto(String nomeProduto, double valor, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @NonNull
    @Override
    public String toString() {
        return "Nome: " + nomeProduto +"   R$"+valor+"     Qtd:"+quantidade;
    }
}
