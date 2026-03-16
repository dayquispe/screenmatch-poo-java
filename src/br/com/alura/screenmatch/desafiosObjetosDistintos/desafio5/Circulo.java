package br.com.alura.screenmatch.desafiosObjetosDistintos.desafio5;

public class Circulo implements Forma {
    double raio;
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
