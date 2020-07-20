package com.eloisa.cursomc.services;

import java.util.Optional;

import com.eloisa.cursomc.domain.Categoria;
import com.eloisa.cursomc.repositories.CategoriaRepository;
import com.eloisa.cursomc.services.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                        "Objeto não encontrado! Id " + id + ", Tipo: " + Categoria.class.getName()));
    }
    
}