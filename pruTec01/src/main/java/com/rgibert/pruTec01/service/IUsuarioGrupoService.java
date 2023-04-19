package com.rgibert.pruTec01.service;

import java.util.List;

import com.rgibert.pruTec01.dto.UsuarioGrupo;

public interface IUsuarioGrupoService {
	public List<UsuarioGrupo> listarUsuarioGrupos(); // Listar All

	public UsuarioGrupo guardarUsuarioGrupo(UsuarioGrupo usuarioGrupo); // Guarda un usuarioGrupo CREATE

	public UsuarioGrupo usuarioGrupoXID(int id); // Leer datos de un usuarioGrupo READ

	public void eliminarUsuarioGrupo(int id);// Elimina el usuarioGrupo DELETE
}
