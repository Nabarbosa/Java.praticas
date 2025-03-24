package com.example.aula_2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cpf;
    private String rg;
    private String matricula;
    private String setor;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String cpf, Long id, String matricula, String rg, double salario, String setor) {
        this.cpf = cpf;
        this.id = id;
        this.matricula = matricula;
        this.rg = rg;
        this.salario = salario;
        this.setor = setor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", id=" + id +
                ", rg='" + rg + '\'' +
                ", matricula='" + matricula + '\'' +
                ", setor='" + setor + '\'' +
                ", salario=" + salario +
                '}';
    }
}
