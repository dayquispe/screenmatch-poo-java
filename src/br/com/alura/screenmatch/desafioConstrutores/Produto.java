package br.com.alura.screenmatch.desafioConstrutores;

import java.util.ArrayList;

public class Produto {
    private String nome = "";
    private double preco = 0;
    private int quantidade = 0;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "(" + this.getNome() + ", "  +  this.getPreco() + ", " + this.getQuantidade()+ ")";
    }

    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Farinha", 7.0, 11);
        Produto produto2 = new Produto("Sal", 5.0, 4);
        Produto produto3 = new Produto("Leite", 6.50, 8);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamnaho da lista de produtos é: " + listaDeProdutos.size());

        System.out.println("O produto Farinha esta na posição da lista número: " + listaDeProdutos.indexOf(produto1));

        System.out.println("Lista dos produtos: " + listaDeProdutos);
    }
}
