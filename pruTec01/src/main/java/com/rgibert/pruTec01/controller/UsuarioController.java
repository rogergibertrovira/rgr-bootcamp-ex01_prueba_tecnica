package com.rgibert.pruTec01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgibert.pruTec01.dto.Usuario;
import com.rgibert.pruTec01.service.UsuarioServiceImp;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UsuarioServiceImp usuarioServiceImp;

	@GetMapping("/usuarios")
	public List<Usuario> listarUsuarios() {
		return usuarioServiceImp.listarUsuarios();
	}

	@PostMapping("/usuarios")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImp.guardarUsuario(usuario);
	}

	@GetMapping("/usuarios/{id}")
	public Usuario usuarioXID(@PathVariable(name = "id") int id) {
		Usuario usuarioXID = new Usuario();
		usuarioXID = usuarioServiceImp.usuarioXID(id);
		return usuarioXID;
	}

	@PutMapping("/usuarios/{id}")
	public Usuario actualizarUsuario(@PathVariable(name = "id") int id, @RequestBody Usuario usuario) {
		Usuario usuarioSeleccionado = new Usuario();
		Usuario usuarioActualizado = new Usuario();

		usuarioSeleccionado = usuarioServiceImp.usuarioXID(id);

		usuarioSeleccionado.setNombreApel(usuario.getNombreApel());
		usuarioSeleccionado.setUsername(usuario.getUsername());
		usuarioSeleccionado.setContrasena(usuario.getContrasena());
		usuarioSeleccionado.setEmail(usuario.getEmail());
		
		usuarioActualizado = usuarioServiceImp.actualizarUsuario(usuarioSeleccionado);

		return usuarioActualizado;
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void eliminarUsuario(@PathVariable(name = "id") int id) {
		usuarioServiceImp.eliminarUsuario(id);
	}
	
	@GetMapping("/usuarios/username/{username}")
	public List<Usuario> listarUsuariosUsername(@PathVariable(name="username") String username){
		return usuarioServiceImp.listarUsuariosUsername(username);
	}
}
