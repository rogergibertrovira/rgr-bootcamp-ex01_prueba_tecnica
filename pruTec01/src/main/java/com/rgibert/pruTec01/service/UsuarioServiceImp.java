package com.rgibert.pruTec01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.pruTec01.dao.IUsuarioDAO;
import com.rgibert.pruTec01.dto.Usuario;

@Service
public class UsuarioServiceImp implements IUsuarioService {

	@Autowired
	IUsuarioDAO iUsuarioDAO;

	@Override
	public List<Usuario> listarUsuarios() {
		return iUsuarioDAO.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public Usuario usuarioXID(int id) {
		return iUsuarioDAO.findById(id).get();
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public void eliminarUsuario(int id) {
		iUsuarioDAO.deleteById(id);
	}

	@Override
	public List<Usuario> listarUsuariosUsername(String username) {
		return iUsuarioDAO.findByUsername(username);
	}
}
