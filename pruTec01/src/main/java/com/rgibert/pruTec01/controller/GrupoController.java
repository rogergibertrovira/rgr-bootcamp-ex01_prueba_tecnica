package com.rgibert.pruTec01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgibert.pruTec01.dto.Grupo;
import com.rgibert.pruTec01.service.GrupoServiceImp;

@RestController
@RequestMapping("/api")
public class GrupoController {

	@Autowired
	GrupoServiceImp grupoServiceImp;

	@GetMapping("/grupos")
	public List<Grupo> listarUsuarios() {
		return grupoServiceImp.listarGrupos();
	}

	@PostMapping("/grupos")
	public Grupo guardarUsuario(@RequestBody Grupo usuario) {
		Grupo grupoXID = new Grupo();
		grupoXID = grupoServiceImp.guardarGrupo(usuario);
		return grupoXID; 
	}

	@GetMapping("/grupos/{id}")
	public Grupo usuarioXID(@PathVariable(name = "id") int id) {
		return grupoServiceImp.grupoXID(id);
	}

	@DeleteMapping("/grupos/{id}")
	public void eliminarGrupo(@PathVariable(name = "id") int id) {
		grupoServiceImp.eliminarGrupo(id);
	}

	@GetMapping("/grupos/nombre/{nombre}")
	public List<Grupo> listarGruposNombre(@PathVariable(name = "nombre") String nombre) {
		return grupoServiceImp.listarGruposNombre(nombre);
	}
}
