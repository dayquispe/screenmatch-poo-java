package br.com.alura.screenmatch.desafiosObjetosDistintos.desafio4;

import java.util.ArrayList;

public class Principal4 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Esmalte", 9);
        Produto p2 = new Produto("Caneta", 9);
        Produto p3 = new Produto("Livro", 9);
        Produto p4 = new Produto("Tinta", 9);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
        listaProdutos.add(p4);

        double precoTotal = 0;
        for (Produto produto : listaProdutos) {
            precoTotal += produto.getPreco();
        }

        double precoMedio = precoTotal / listaProdutos.size();

        System.out.println("O preço medio da lista: "  + listaProdutos  + " é R$" + precoMedio);


    }
}
