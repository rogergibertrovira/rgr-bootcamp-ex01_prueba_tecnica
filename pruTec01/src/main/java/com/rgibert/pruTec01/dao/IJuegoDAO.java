package com.rgibert.pruTec01.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.pruTec01.dto.Juego;

public interface IJuegoDAO extends JpaRepository<Juego, Integer> {

	// Listar juegos por campo nombre
		public List<Juego> findByNombre(String nombre);
}
