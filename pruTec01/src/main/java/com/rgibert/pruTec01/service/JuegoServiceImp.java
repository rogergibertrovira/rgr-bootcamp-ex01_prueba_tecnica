package com.rgibert.pruTec01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgibert.pruTec01.dao.IJuegoDAO;
import com.rgibert.pruTec01.dto.Juego;

@Service
public class JuegoServiceImp implements IJuegoService {

	@Autowired
	IJuegoDAO iJuegoDAO;

	@Override
	public List<Juego> listarJuegos() {
		return iJuegoDAO.findAll();
	}

	@Override
	public Juego guardarJuego(Juego juego) {
		return iJuegoDAO.save(juego);
	}

	@Override
	public Juego juegoXID(int id) {
		return iJuegoDAO.findById(id).get();
	}

	@Override
	public Juego actualizarJuego(Juego juego) {
		return iJuegoDAO.save(juego);
	}

	@Override
	public void eliminarJuego(int id) {
		iJuegoDAO.deleteById(id);
	}

	@Override
	public List<Juego> listarJuegosNombre(String nombre) {
		return iJuegoDAO.findByNombre(nombre);
	}

}
