package com.example;

public class Cliente {
    private  String nome;
    private int idade;
    private Pet pet;

    public Cliente(int idade, String nome, Pet pet) {
        this.idade = idade;
        this.nome = nome;
        this.pet = pet;
    }

    public Cliente() {
    }

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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", idade=" + idade + ", pet=" + pet + "]";
    }


}
