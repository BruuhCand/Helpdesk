package com.bruna.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruna.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
