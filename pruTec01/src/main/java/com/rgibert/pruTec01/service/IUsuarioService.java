package com.rgibert.pruTec01.service;

import java.util.List;

import com.rgibert.pruTec01.dto.Usuario;

public interface IUsuarioService {

	public List<Usuario> listarUsuarios(); // Listar All

	public Usuario guardarUsuario(Usuario usuario); // Guarda un usuario CREATE

	public Usuario usuarioXID(int id); // Leer datos de un usuario READ

	public Usuario actualizarUsuario(Usuario usuario); // Actualiza datos del usuario UPDATE

	public void eliminarUsuario(int id);// Elimina el usuario DELETE
	
	public List<Usuario> listarUsuariosUsername(String username);// Listar usuarios por campo nombre
}
