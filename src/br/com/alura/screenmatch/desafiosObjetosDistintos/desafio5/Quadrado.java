package br.com.alura.screenmatch.desafiosObjetosDistintos.desafio5;

public class Quadrado implements Forma{
    double lado;
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
