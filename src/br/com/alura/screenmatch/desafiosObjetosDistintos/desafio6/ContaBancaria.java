package br.com.alura.screenmatch.desafiosObjetosDistintos.desafio6;

public class ContaBancaria {
    private int numeroDeConta = 0;
    private double saldo = 0;

    public ContaBancaria(int numeroDeConta, double saldo) {
        this.numeroDeConta = numeroDeConta;
        this.saldo = saldo;
    }

    public int getNumeroDeConta() {
        return numeroDeConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
