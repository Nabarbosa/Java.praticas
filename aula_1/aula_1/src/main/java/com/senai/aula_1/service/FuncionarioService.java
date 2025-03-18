package com.senai.aula_1.service;

import com.senai.aula_1.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public 
}
