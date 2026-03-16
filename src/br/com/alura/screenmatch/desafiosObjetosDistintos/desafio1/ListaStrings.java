package br.com.alura.screenmatch.desafiosObjetosDistintos.desafio1;

import java.util.ArrayList;

public class ListaStrings {
    public static void main(String[] args) {
        ArrayList<String> listaDePalavras = new ArrayList<>();

        String p1 ="Borboleta";
        String p2 ="Depende";
        String p3 ="Suco";
        String p4 ="Sorvete";
        String p5 ="Jantar";

        listaDePalavras.add(p1);
        listaDePalavras.add(p2);
        listaDePalavras.add(p3);
        listaDePalavras.add(p4);
        listaDePalavras.add(p5);

        for(String palavra:listaDePalavras){
            System.out.println("Palavra: " + palavra);
        }
    }
}
