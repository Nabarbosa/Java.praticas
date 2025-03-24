package com.example.aula_2.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tab_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    private String email;
    private String senha;

    public Usuario() {
    }

    public Usuario(String email, Long id, String nome, String senha) {
        this.email = email;
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return " - Usuario" +
                "Email: " + email +
                "ID: " + id +
                "Nome :" + nome +
                "Senha: " + senha;
    }
}
