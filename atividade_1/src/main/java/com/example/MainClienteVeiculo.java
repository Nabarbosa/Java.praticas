package com.example;

public class MainClienteVeiculo {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("123.456.789-10", "Rua Almirante Costa nº11", 56, "João Batista", "71 93625-0123");
        System.out.println(cliente1.toString());

        Veiculo veiculo1 = new Veiculo("45f9878", "Rosa", "5","56.05", "150 km/h", "25 Km por litro");
        System.out.println(veiculo1.toString());
    }
}