package br.com.alura.screenmatch.desafios.desafio3;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " X " + i + " = " + i*numero);
        }
    }
}
