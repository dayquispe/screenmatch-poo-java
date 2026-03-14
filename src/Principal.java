import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.desafios.desafio2.CalculadoraSalaRetangular;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

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
    }
}
