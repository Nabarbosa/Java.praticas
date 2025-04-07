package com.senai.Atividade.API.REST.com.Spring.Boot.repository;

import com.senai.Atividade.API.REST.com.Spring.Boot.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
