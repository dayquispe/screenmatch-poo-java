package br.com.alura.screenmatch.desafios.desafio6;

public class Servico implements Vendavel{
    double precoHOra = 500;
    @Override
    public double calculaPrecoFinal(int quantidade) {
        return precoHOra * quantidade;
    }

    @Override
    public double desconto(double percentualDesconto) {
        return percentualDesconto;
    }
}
