package com.devdanielc.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devdanielc.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
	

}
