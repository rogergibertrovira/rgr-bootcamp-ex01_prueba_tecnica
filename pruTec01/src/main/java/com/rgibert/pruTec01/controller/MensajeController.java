package com.rgibert.pruTec01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgibert.pruTec01.dto.Mensaje;
import com.rgibert.pruTec01.service.MensajeServiceImp;

@RestController
@RequestMapping("/api")
public class MensajeController {
	
	@Autowired
	MensajeServiceImp mensajeServiceImp;

	@GetMapping("/mensajes")
	public List<Mensaje> listarMensajes() {
		return mensajeServiceImp.listarMensajes();
	}

	@PostMapping("/mensajes")
	public Mensaje guardarMensaje(@RequestBody Mensaje mensaje) {
		return mensajeServiceImp.guardarMensaje(mensaje);
	}

	@GetMapping("/mensajes/{id}")
	public Mensaje mensajeXID(@PathVariable(name = "id") int id) {
		Mensaje mensajeXID = new Mensaje();
		mensajeXID = mensajeServiceImp.mensajeXID(id);
		return mensajeXID;
	}
}
