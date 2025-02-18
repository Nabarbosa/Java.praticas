package com.example;

public class Funcionario {
    private int codigoDoFuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBancaria contaBancaria;
    
    public Funcionario(int codigoDoFuncionario, String nome, String endereco, String telefone, String email,
            ContaBancaria contaBancaria) {
        this.codigoDoFuncionario = codigoDoFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
    }

    public Funcionario() {
    }

    public int getCodigoDoFuncionario() {
        return codigoDoFuncionario;
    }

    public void setCodigoDoFuncionario(int codigoDoFuncionario) {
        this.codigoDoFuncionario = codigoDoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "Funcionario [codigoDoFuncionario=" + codigoDoFuncionario + ", nome=" + nome + ", endereco=" + endereco
                + ", telefone=" + telefone + ", email=" + email + ", contaBancaria=" + contaBancaria + "]";
    }

    
}
