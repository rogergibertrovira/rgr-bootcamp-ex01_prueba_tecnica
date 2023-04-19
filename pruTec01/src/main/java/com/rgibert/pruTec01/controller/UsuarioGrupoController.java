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

import com.rgibert.pruTec01.dto.UsuarioGrupo;
import com.rgibert.pruTec01.service.UsuarioGrupoServiceImp;

@RestController
@RequestMapping("/api")
public class UsuarioGrupoController {

	@Autowired
	UsuarioGrupoServiceImp usuarioGrupoServiceImp;
	
	@GetMapping("/usuariogrupo")
	public List<UsuarioGrupo> listarUsuariosGrupos() {
		return usuarioGrupoServiceImp.listarUsuarioGrupos();
	}

	@PostMapping("/usuariogrupo")
	public UsuarioGrupo guardarUsuarioGrupo(@RequestBody UsuarioGrupo usuarioGrupo) {
		return usuarioGrupoServiceImp.guardarUsuarioGrupo(usuarioGrupo);
	}

	@GetMapping("/usuariogrupo/{id}")
	public UsuarioGrupo usuarioGrupoXID(@PathVariable(name = "id") int id) {
		UsuarioGrupo usuarioGrupoXID = new UsuarioGrupo();
		usuarioGrupoServiceImp.usuarioGrupoXID(id);
		return usuarioGrupoXID;
	}
	
	@DeleteMapping("/usuariogrupo/{id}")
	public void eliminarUsuarioGrupo(@PathVariable(name = "id") int id) {
		usuarioGrupoServiceImp.eliminarUsuarioGrupo(id);
	}
}
