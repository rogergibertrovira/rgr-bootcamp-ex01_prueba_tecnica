package com.rgibert.pruTec01.service;

import java.util.List;

import com.rgibert.pruTec01.dto.Juego;

public interface IJuegoService {
	public List<Juego> listarJuegos(); // Listar All

	public Juego guardarJuego(Juego juego); // Guarda un juego CREATE

	public Juego juegoXID(int id); // Leer datos de un juego READ

	public Juego actualizarJuego(Juego juego); // Actualiza datos del juego UPDATE

	public void eliminarJuego(int id);// Elimina el juego DELETE
	
	public List<Juego> listarJuegosNombre(String nombre);// Listar juegos por campo nombre
}
