package com.rgibert.pruTec01.service;

import java.util.List;

import com.rgibert.pruTec01.dto.Mensaje;

public interface IMensajeService {
	public List<Mensaje> listarMensajes(); // Listar All

	public Mensaje guardarMensaje(Mensaje mensaje); // Guarda un mensaje CREATE

	public Mensaje mensajeXID(int id); // Leer datos de un mensaje READ
}
