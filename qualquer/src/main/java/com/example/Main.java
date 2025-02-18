package com.example;

public class Main {
    public static void main(String[] args) {
       Pet pet = new Pet("Ração", 1, "Kira", "Pastor Alemão");
       
       System.out.println("Nome do pet: " + pet.getNome());
       System.out.println("Ração do pet: " + pet.getRaca());
       System.out.println("Idade do pet: " + pet.getIdade());
       System.out.println("Alimentação do pet: " + pet.getAlimetacao());

    }
}