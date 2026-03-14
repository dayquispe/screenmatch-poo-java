import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.desafioFinal.MinhasPreferidas;
import br.com.alura.screenmatch.desafioFinal.Musica;
import br.com.alura.screenmatch.desafioFinal.Podcasts;
import br.com.alura.screenmatch.desafios.desafio2.CalculadoraSalaRetangular;
import br.com.alura.screenmatch.desafios.desafio3.TabuadaMultiplicacao;
import br.com.alura.screenmatch.desafios.desafio4.ConversorTemperaturaPadrao;
import br.com.alura.screenmatch.desafios.desafio5.Livro;
import br.com.alura.screenmatch.desafios.desafio5.ProdutoFisico;
import br.com.alura.screenmatch.desafios.desafio6.Produto;
import br.com.alura.screenmatch.desafios.desafio6.Servico;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.awt.event.WindowListener;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O podero chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Garfield");
        meuFilme2.setAnoDeLancamento(1970);
        meuFilme2.setDuracaoEmMinutos(150);

        meuFilme.exibirFichaTecnica();

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Lucifer");
        minhaSerie.setAnoDeLancamento(2003);
        minhaSerie.setDuracaoEmMinutos(4);
        minhaSerie.setTemporadas(2);
        minhaSerie.setMinutosPorEpisodio(20);
        minhaSerie.setEpisodiosPorTemporada(2);
        minhaSerie.exibirFichaTecnica();

       minhaSerie.exibirFichaTecnica();
        System.out.println("Para maratonar a série, serão: " + minhaSerie.getDuracaoEmMinutos() + " minutos");


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(380);
        filtro.filtra(episodio);

        System.out.println("========================");
        System.out.println("Usando a Classe CalculadoraSalaRetangular");
        CalculadoraSalaRetangular calculaSala = new CalculadoraSalaRetangular();

        calculaSala.calcularArea(4, 5);
        calculaSala.calcularPerimetro(4, 5);

        System.out.println("========================");
        System.out.println("Usando a Classe tabuada ");
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(5);

        System.out.println("========================");
        System.out.println("Usando a Classe ConversorTemperaturaPadrao ");

        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        conversorTemperaturaPadrao.fahrenheitParaCelsius(84);
        conversorTemperaturaPadrao.celsiusParaFahrenheit(32);

        System.out.println("========================");
        System.out.println("Usando a Classe ConversorTemperaturaPadrao ");
        Livro livro = new Livro();
        double novoValorLivro = livro.calcularPrecoFinal(150);
        System.out.println("O valor do livro é R$" + 150 + ", com desconto é " + novoValorLivro );

        ProdutoFisico produto = new ProdutoFisico();
        double novoPrecoProduto = produto.calcularPrecoFinal(54);
        System.out.println("O valor do produto é R$" + 54 + ", com desconto é " + novoPrecoProduto );


        System.out.println("========================");
        System.out.println("Usando aa Classea Produto e Servico ");
        Servico servico = new Servico();
        double precoServicoFinal = servico.calculaPrecoFinal(5) - servico.desconto(0.2);
        System.out.println("Preço final do serviço é " + precoServicoFinal);

        Produto produto2 = new Produto();
        double precoProdutoFinal = produto2.calculaPrecoFinal(45) - produto2.desconto(0.07);
        System.out.println("Preço final do produto é " + precoProdutoFinal);

        System.out.println("========================");
        System.out.println("===========Desafio final=============");

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 100; i++) {
            minhaMusica.reproduzer();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcasts meuPodcast = new Podcasts();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus mendes");

        for (int i = 0; i < 5000 ; i++) {
            meuPodcast.reproduzer();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);


    }
}
