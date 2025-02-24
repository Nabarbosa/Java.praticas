package com.example;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Marta", "45", new Endereco("Rua Almeida", "11", "Salvador"));

        System.out.println(cliente.toString());
    }
}
