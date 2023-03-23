package com.examentecnico.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Clientes {
	
	
	@Id
	@Column(name = "idCliente", nullable = false)
	private Long idCliente;
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "activo")
	private boolean activo;
	

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Clientes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clientes(Long idCliente, String nombre, boolean activo) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.activo = activo;
	}
	
	
	public Clientes(String nombre, boolean activo) {
		super();
		this.nombre = nombre;
		this.activo = activo;
	}
	
		
	
	
	
	
	
	
	
	

}
