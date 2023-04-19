package com.rgibert.pruTec01.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensajes")
public class Mensaje {

	// Atributos de entidad mensaje
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "contenido")
	private String contenido;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "grupo_id")
	private Grupo grupo;

	// Constructores
	public Mensaje() {

	}

	public Mensaje(String contenido, Usuario usuario, Juego juego, Grupo grupo) {
		this.contenido = contenido;
		this.usuario = usuario;
		this.grupo = grupo;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getContenido() {
		return contenido;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", contenido=" + contenido + ", usuario=" + usuario + ", grupo=" + grupo + "]";
	}
}
