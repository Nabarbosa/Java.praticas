package com.senai.aula_1.service;

import com.senai.aula_1.model.Usuario;
import com.senai.aula_1.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }


    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    public void updateUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
