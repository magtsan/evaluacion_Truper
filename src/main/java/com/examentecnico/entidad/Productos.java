package com.examentecnico.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Productos")
public class Productos {
	
	@Id
	private Long idProducto;
	
	@Column(name = "clave", nullable = false, length = 15)
	private String clave;
	
	@Column(name = "descripcion", length = 150)
	private String descripcion;
	
	@Column(name = "activo")
	private boolean activo;
	

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Productos(Long idProducto, String clave, String descripcion, boolean activo) {
		super();
		this.idProducto = idProducto;
		this.clave = clave;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
