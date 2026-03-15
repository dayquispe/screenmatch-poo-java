package br.com.alura.screenmatch.desafiosListasEColecoes;

public class Pessoa {
    private String nome = "";
    private int idade = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " Idade:" + this.getIdade();
    }

}
