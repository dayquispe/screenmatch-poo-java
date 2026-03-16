package br.com.alura.screenmatch.desafiosObjetosDistintos.desafio5;

import java.util.ArrayList;

public class PrincipalDesafio4 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        ArrayList<Forma> listaFormas  = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (Forma forma: listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
