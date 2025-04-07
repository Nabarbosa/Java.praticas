package com.senai.Atividade.API.REST.com.Spring.Boot.model;

public enum Sexo {
    FEMININO("Feminino"),
    MASCULINO("Masculino"),
    OUTRO("Outro");

    private String texto;

    Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
