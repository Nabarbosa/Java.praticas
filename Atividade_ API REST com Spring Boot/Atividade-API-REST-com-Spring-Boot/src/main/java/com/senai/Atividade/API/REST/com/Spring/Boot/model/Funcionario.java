package com.senai.Atividade.API.REST.com.Spring.Boot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "E-mail é obrigratório.")
    @Email(message = "O e-mail deve ser válido.")
    private String email;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    private double salario;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Funcionario(){
    }

    public Funcionario(String email, Endereco endereco, Long id, String nome, double salario, Sexo sexo) {
        this.email = email;
        this.endereco = endereco;
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
    }

    public @NotBlank(message = "E-mail é obrigratório.") @Email(message = "O e-mail deve ser válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "E-mail é obrigratório.") @Email(message = "O e-mail deve ser válido.") String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario() {
        this.salario = salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", salario=" + salario +
                ", endereco=" + endereco +
                '}';
    }
}
