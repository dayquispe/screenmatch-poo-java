package br.com.alura.screenmatch.desafiosObjetosDistintos.desafio4;

public class Produto {
    private String nome = "" ;
    private double preco = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return getNome() + ", " + getPreco();
    }
}
