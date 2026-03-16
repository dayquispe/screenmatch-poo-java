package br.com.alura.screenmatch.desafiosObjetosDistintos.desafio2;

public class Cachorro extends Animal {
    private String raca = "";
    private String nome = "";
    private int idade = 0;

    public Cachorro(String especie, String raca, String nome, int idade) {
        super(especie);
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

}
