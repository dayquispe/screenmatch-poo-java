package br.com.alura.screenmatch.desafios.desafio6;

public class Produto implements Vendavel{
    double precoProduto = 4;

    @Override
    public double calculaPrecoFinal(int quantidade) {
        return quantidade * precoProduto;
    }

    @Override
    public double desconto(double percentualDesconto) {
        return percentualDesconto;
    }
}
