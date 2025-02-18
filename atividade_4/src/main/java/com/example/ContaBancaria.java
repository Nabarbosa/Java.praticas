package com.example;

public class ContaBancaria {
    private String banco;
    private String agencia;
    private String numeroDaConta;
    private String tipoDeConta;
    private double saldoAtual;
    private double limiteDisponivel;
    
    public ContaBancaria(String banco, String agencia, String numeroDaConta, String tipoDeConta, double saldoAtual,
            double limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.tipoDeConta = tipoDeConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    public ContaBancaria() {
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConra(String numeroDaConra) {
        this.numeroDaConta = numeroDaConra;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "ContaBancaria [banco=" + banco + ", agencia=" + agencia + ", numeroDaConta=" + numeroDaConta
                + ", tipoDeConta=" + tipoDeConta + ", saldoAtual=" + saldoAtual + ", limiteDisponivel="
                + limiteDisponivel + "]";
    }

    
}
