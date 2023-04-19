package com.rgibert.pruTec01.service;

import java.util.List;

import com.rgibert.pruTec01.dto.Grupo;

public interface IGrupoService {
	public List<Grupo> listarGrupos(); // Listar All

	public Grupo guardarGrupo(Grupo grupo); // Guarda un grupo CREATE

	public Grupo grupoXID(int id); // Leer datos de un grupo READ

	public void eliminarGrupo(int id);// Elimina el grupo DELETE
	
	public List<Grupo> listarGruposNombre(String nombre);// Listar grupos por campo nombre
}
