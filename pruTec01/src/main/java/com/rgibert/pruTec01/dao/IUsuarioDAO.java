package com.rgibert.pruTec01.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.pruTec01.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Integer> {

	// Listar usuarios por campo username
	public List<Usuario> findByUsername(String username);

}
