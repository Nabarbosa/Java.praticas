package com.example;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(001, "Marta Silveira", "Rua Carlos Drumond", "71 98956-3562", "marta@gmail.com",
             new ContaBancaria("002", "001", "15", "Black", 2000.00, 10000.00));

             System.out.println(funcionario.toString());
    }
}