package com.rgibert.pruTec01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.pruTec01.dao.IGrupoDAO;
import com.rgibert.pruTec01.dto.Grupo;

@Service
public class GrupoServiceImp implements IGrupoService {

	@Autowired
	IGrupoDAO iGrupoDAO;

	@Override
	public List<Grupo> listarGrupos() {
		return iGrupoDAO.findAll();
	}

	@Override
	public Grupo guardarGrupo(Grupo grupo) {
		return iGrupoDAO.save(grupo);
	}

	@Override
	public Grupo grupoXID(int id) {
		return iGrupoDAO.findById(id).get();
	}

	@Override
	public void eliminarGrupo(int id) {
		iGrupoDAO.deleteById(id);
	}

	@Override
	public List<Grupo> listarGruposNombre(String nombre) {
		return iGrupoDAO.findByNombre(nombre);
	}

}
