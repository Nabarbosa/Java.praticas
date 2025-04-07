package com.senai.Atividade.API.REST.com.Spring.Boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class Desenvolvedor {

    @GetMapping
    public String nomeDoDesenvolvedor(){
        return "Tainá Barbosa Teixeira";
    }
}
