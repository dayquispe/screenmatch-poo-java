package br.com.alura.screenmatch.desafioConstrutores;

import java.util.ArrayList;

public class ProdutoPerecivel extends Produto{

    private String dataValidade = "";

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getDataValidade() + ")";
    }

    public static void main(String[] args) {
        ArrayList<ProdutoPerecivel> listaDeprodutospereciveis = new ArrayList<>();

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Arroz", 35.0, 12, "15/05/2026");

        listaDeprodutospereciveis.add(produtoPerecivel);

        System.out.println(listaDeprodutospereciveis);
    }
}
