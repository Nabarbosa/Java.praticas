package com.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(25, "Marta",
            new Pet("Kiara", 1, "Pitbull"));

            System.out.println(cliente1.toString());

        Cliente cliente2 = new Cliente(30, "João",
            new Pet("Spaike", 5, "SRD"));

            System.out.println(cliente2.toString());
    }
}