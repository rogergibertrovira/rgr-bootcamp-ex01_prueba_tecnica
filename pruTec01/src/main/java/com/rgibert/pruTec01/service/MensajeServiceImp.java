package com.rgibert.pruTec01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.pruTec01.dao.IMensajeDAO;
import com.rgibert.pruTec01.dto.Mensaje;

@Service
public class MensajeServiceImp implements IMensajeService {

	@Autowired
	IMensajeDAO iMensajeDAO;

	@Override
	public List<Mensaje> listarMensajes() {
		return iMensajeDAO.findAll();
	}

	@Override
	public Mensaje guardarMensaje(Mensaje mensaje) {
		return iMensajeDAO.save(mensaje);
	}

	@Override
	public Mensaje mensajeXID(int id) {
		return iMensajeDAO.findById(id).get();
	}
}
