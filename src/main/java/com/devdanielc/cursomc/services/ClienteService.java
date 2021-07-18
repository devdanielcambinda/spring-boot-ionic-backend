package com.devdanielc.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devdanielc.cursomc.domain.Cliente;
import com.devdanielc.cursomc.repositories.ClienteRepository;
import com.devdanielc.cursomc.services.exceptions.ObjectNotFoundException;


@Service 
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}

}
