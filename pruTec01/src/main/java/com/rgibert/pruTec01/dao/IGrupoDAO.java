package com.rgibert.pruTec01.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.pruTec01.dto.Grupo;

public interface IGrupoDAO extends JpaRepository<Grupo, Integer> {

	// Listar grupos por campo nombre
	public List<Grupo> findByNombre(String nombre);

}
