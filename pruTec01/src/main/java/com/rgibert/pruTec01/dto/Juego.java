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
@Table(name = "juegos")
public class Juego {

	// Atributos de entidad juego
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
	@JoinColumn(name = "grupos_FK2")
	private List<Grupo> grupo;

	// Constructores
	public Juego() {

	}

	public Juego(String nombre, String descripcion, String imagenURL) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagenURL = imagenURL;
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

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Juego")
	public List<Grupo> getGrupos() {
		return grupo;
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

	public void setJuegos(List<Grupo> grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Juego [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagenURL=" + imagenURL
				+ ", grupo=" + grupo + "]";
	}
}
