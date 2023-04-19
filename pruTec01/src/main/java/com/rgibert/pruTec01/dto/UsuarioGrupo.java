package com.rgibert.pruTec01.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario_grupo")
public class UsuarioGrupo {

	// Atributos de entidad usuario_grupo
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "grupo_id")
	private Grupo grupo;

	// Constructores
	public UsuarioGrupo() {

	}

	public UsuarioGrupo(Usuario usuario, Grupo grupo) {
		this.usuario = usuario;
		this.grupo = grupo;
	}

	// Getters
	public int getId() {
		return id;
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

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "UsuarioGrupo [id=" + id + ", usuario=" + usuario + ", grupo=" + grupo + "]";
	}
}
