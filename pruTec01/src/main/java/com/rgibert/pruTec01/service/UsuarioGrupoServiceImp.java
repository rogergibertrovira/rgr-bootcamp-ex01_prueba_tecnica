package com.rgibert.pruTec01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.pruTec01.dao.IUsuarioGrupoDAO;
import com.rgibert.pruTec01.dto.UsuarioGrupo;

@Service
public class UsuarioGrupoServiceImp implements IUsuarioGrupoService {

	@Autowired
	IUsuarioGrupoDAO iUsuarioGrupoDAO;

	@Override
	public List<UsuarioGrupo> listarUsuarioGrupos() {
		return iUsuarioGrupoDAO.findAll();
	}

	@Override
	public UsuarioGrupo guardarUsuarioGrupo(UsuarioGrupo usuarioGrupo) {
		return iUsuarioGrupoDAO.save(usuarioGrupo);
	}

	@Override
	public UsuarioGrupo usuarioGrupoXID(int id) {
		return iUsuarioGrupoDAO.findById(id).get();
	}

	@Override
	public void eliminarUsuarioGrupo(int id) {
		iUsuarioGrupoDAO.deleteById(id);
	}

}
