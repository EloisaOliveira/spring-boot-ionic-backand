package com.eloisa.cursomc.repositories;

import com.eloisa.cursomc.domain.enums.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    
}