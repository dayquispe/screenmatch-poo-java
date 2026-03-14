package br.com.alura.screenmatch.desafios.desafio5;

public class Livro implements Calculavel {
    @Override
    public double calcularPrecoFinal(double preco) {
        double outrodesconto = 0.2 * preco;
        return preco - outrodesconto;
    }
}
