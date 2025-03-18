package com.senai.aula_1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    private final FuncionarioService funcionarioService;
}
