package com.rgibert.pruTec01.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

	// Atributos de entidad usuario
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre_apel")
	private String nombreApel;
	@Column(name = "username")
	private String username;
	@Column(name = "contrasena")
	private String contrasena;
	@Column(name = "email")
	private String email;

	@OneToMany
	@JoinColumn(name = "mensajes_FK1")
	private List<Mensaje> mensaje;

	@OneToMany
	@JoinColumn(name = "grupos_FK1")
	private List<Grupo> grupo;
	
	@OneToMany
	@JoinColumn(name = "usuario_grupo_FK1")
	private List<UsuarioGrupo> usuarioGrupo;

	// Constructores
	public Usuario() {

	}

	public Usuario(String nombreApel, String username, String contrasena, String email) {
		this.nombreApel = nombreApel;
		this.username = username;
		this.contrasena = contrasena;
		this.email = email;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getNombreApel() {
		return nombreApel;
	}

	public String getUsername() {
		return username;
	}

	public String getContrasena() {
		return contrasena;
	}

	public String getEmail() {
		return email;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Mensaje")
	public List<Mensaje> getMensajes() {
		return mensaje;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Grupo")
	public List<Grupo> getGrupos() {
		return grupo;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "UsuarioGrupo")
	public List<UsuarioGrupo> getUsuarioGrupos() {
		return usuarioGrupo;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setNombreApel(String nombreApel) {
		this.nombreApel = nombreApel;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMensajes(List<Mensaje> mensaje) {
		this.mensaje = mensaje;
	}

	public void setUsuarioGrupos(List<UsuarioGrupo> usuarioGrupo) {
		this.usuarioGrupo = usuarioGrupo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreApel=" + nombreApel + ", username=" + username + ", contrasena="
				+ contrasena + ", mensajes=" + mensaje + ", usuarioGrupos=" + usuarioGrupo + "]";
	}
}
