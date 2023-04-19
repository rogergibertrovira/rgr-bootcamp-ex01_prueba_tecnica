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

import com.rgibert.pruTec01.dto.Juego;
import com.rgibert.pruTec01.service.JuegoServiceImp;

@RestController
@RequestMapping("/api")
public class JuegoController {

	@Autowired
	JuegoServiceImp juegoServiceImp;
	
	@GetMapping("/juegos")
	public List<Juego> listarJuegos() {
		return juegoServiceImp.listarJuegos();
	}

	@PostMapping("/juegos")
	public Juego guardarJuego(@RequestBody Juego juego) {
		return juegoServiceImp.guardarJuego(juego);
	}

	@GetMapping("/juegos/{id}")
	public Juego juegoXID(@PathVariable(name = "id") int id) {
		Juego juegoXID = new Juego();
		juegoXID = juegoServiceImp.juegoXID(id);
		return juegoXID;
	}

	@PutMapping("/juegos/{id}")
	public Juego actualizarJuego(@PathVariable(name = "id") int id, @RequestBody Juego juego) {
		Juego juegoSeleccionado = new Juego();
		Juego juegoActualizado = new Juego();

		juegoSeleccionado = juegoServiceImp.juegoXID(id);

		juegoSeleccionado.setNombre(juego.getNombre());
		juegoSeleccionado.setDescripcion(juego.getDescripcion());
		juegoSeleccionado.setImagenURL(juego.getImagenURL());
		
		juegoActualizado = juegoServiceImp.actualizarJuego(juegoSeleccionado);

		return juegoActualizado;
	}
	
	@DeleteMapping("/juegos/{id}")
	public void eliminarJuego(@PathVariable(name = "id") int id) {
		juegoServiceImp.eliminarJuego(id);
	}
	
	@GetMapping("/juegos/nombre/{nombre}")
	public List<Juego> listarJuegosNombre(@PathVariable(name="nombre") String nombre){
		return juegoServiceImp.listarJuegosNombre(nombre);
	}
}
