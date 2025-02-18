package com.example;

public class Veiculo {
    private String placa;
    private String cor;
    private String numeroDePassageiros;
    private String capacidadeDoTanque;
    private String velocidadeMaxima;
    private String consumoMedio;

    public Veiculo(String placa, String cor, String numeroDePassageiros, String capacidadeDoTanque,
            String velocidadeMaxima, String consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public void setNumeroDePassageiros(String numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }

    public String getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(String capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public String getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(String velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(String consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", cor=" + cor + ", numeroDePassageiros=" + numeroDePassageiros
                + ", capacidadeDoTanque=" + capacidadeDoTanque + ", velocidadeMaxima=" + velocidadeMaxima
                + ", consumoMedio=" + consumoMedio + "]";
    }

    
}
