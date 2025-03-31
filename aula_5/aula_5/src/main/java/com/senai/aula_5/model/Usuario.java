package com.senai.aula_5.model;

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

    @NotBlank(message = "O nome é obrigatório.")
    private String nome;

    @NotBlank(message = "O email é obrigratório")
    @Email(message = "Deve ser um email válido!")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 3, message = "A senah deve ter no minimo 3 caracteres")
    private String senha;

    public Usuario() {
    }

    public Usuario(String email, Long id, String nome, String senha) {
        this.email = email;
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public @NotBlank(message = "O email é obrigratório") @Email(message = "Deve ser um email válido!") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é obrigratório") @Email(message = "Deve ser um email válido!") String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "O nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "A senha é obrigatória") @Size(min = 3, message = "A senah deve ter no minimo 3 caracteres") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória") @Size(min = 3, message = "A senah deve ter no minimo 3 caracteres") String senha) {
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
