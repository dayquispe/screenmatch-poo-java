package br.com.alura.screenmatch.desafios.desafio5;

public class ProdutoFisico implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco) {
        double desconto = 0.1 * preco;
        return preco - desconto;
    }
}
