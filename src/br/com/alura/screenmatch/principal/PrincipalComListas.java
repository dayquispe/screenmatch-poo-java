package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O podero chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        outroFilme.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo;  // Variável de referência

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);

        for (Titulo item: listaDeAssistidos){
            //System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println(item.getNome());
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }
    }
}
