package com.senai.aula_4.model;

public enum Sexo {
    FEMININO("Feminino"),
    MASCULINO("Maculino"),
    OUTRO("Outro");

    private String texto;

    Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
