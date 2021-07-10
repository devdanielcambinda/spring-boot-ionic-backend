package com.devdanielc.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devdanielc.cursomc.domain.Categoria;
import com.devdanielc.cursomc.repositories.CategoriaRepository;


@Service 
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria procurar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		}

}
