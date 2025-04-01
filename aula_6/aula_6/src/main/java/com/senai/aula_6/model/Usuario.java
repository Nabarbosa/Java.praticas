package com.senai.aula_6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigratório.")
    private String nome;

    @NotBlank(message = "E-mail é obrigratório.")
    @Email(message = "E-mail deve ser válido.")
    private String email;

    @NotBlank(message = "Senha é obrigratória.")
    @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres")
    private String senha;

    public Usuario() {
    }

    public Usuario(String email, Long id, String nome, String senha) {
        this.email = email;
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public @NotBlank(message = "E-mail é obrigratório.") @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "E-mail é obrigratório.") @Email String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigratório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigratório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Senha é obrigratória.") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha é obrigratória.") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres") String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
