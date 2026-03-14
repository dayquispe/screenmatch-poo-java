package br.com.alura.screenmatch.desafioFinal;

public class Audio{
    private String titulo = "";
    private int totalDeReproducoes = 0;
    private int totalCurtidas = 0;
    private int classificacao = 0;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduzer(){
        this.totalDeReproducoes ++;
    }


}
