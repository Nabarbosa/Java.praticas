package com.example;

public class Pet {
    private String nome;
    private String raca;
    private String Alimetacao;
    private int idade;

    public Pet(String Alimetacao, int idade, String nome, String raca) {
        this.Alimetacao = Alimetacao;
        this.idade = idade;
        this.nome = nome;
        this.raca = raca;
    }

    public Pet() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getAlimetacao() {
        return Alimetacao;
    }

    public void setAlimetacao(String Alimetacao) {
        this.Alimetacao = Alimetacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



}
