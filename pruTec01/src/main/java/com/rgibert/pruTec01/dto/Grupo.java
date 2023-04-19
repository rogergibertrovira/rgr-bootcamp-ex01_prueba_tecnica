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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupos")
public class Grupo {

	// Atributos de entidad grupo
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "imagen_URL")
	private String imagenURL;


	@OneToMany
	@JoinColumn(name = "mensajes_FK2")
	private List<Mensaje> mensaje;
	
	@OneToMany
	@JoinColumn(name = "usuario_grupo_FK2")
	private List<UsuarioGrupo> usuarioGrupo;
	
	@ManyToOne
	@JoinColumn(name = "creador_id")
	private Usuario usuarioCreador;

	@ManyToOne
	@JoinColumn(name = "juego_id")
	private Juego juego;

	// Constructores
	public Grupo() {
	}

	public Grupo(String nombre, String descripcion, String imagenURL, Usuario usuarioCreador, Juego juego) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagenURL = imagenURL;
		this.usuarioCreador = usuarioCreador;
		this.juego = juego;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getImagenURL() {
		return imagenURL;
	}

	public Usuario getUsuarioCreador() {
		return usuarioCreador;
	}

	public Juego getJuego() {
		return juego;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Mensaje")
	public List<Mensaje> getJuegos() {
		return mensaje;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Mensaje")
	public List<UsuarioGrupo> getUsuarioGrupo() {
		return usuarioGrupo;
	}

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setImagenURL(String imagenURL) {
		this.imagenURL = imagenURL;
	}

	public void setUsuarioCreador(Usuario usuarioCreador) {
		this.usuarioCreador = usuarioCreador;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	public void setMensajes(List<Mensaje> mensaje) {
		this.mensaje = mensaje;
	}
	
	public void setUsuarioGrupo(List<UsuarioGrupo> usuarioGrupo) {
		this.usuarioGrupo = usuarioGrupo;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagenURL=" + imagenURL
				+ ", usuarioCreador=" + usuarioCreador + ", juego=" + juego + "]";
	}
}
