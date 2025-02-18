package com.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria ViLa", 36,
            new Endereco("Salvador", "Vila Rui Barbosa", "11B"));

        System.out.println(cliente1.toString());
    }
}