package com.examentecnico.entidad;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ListaCompra")
public class ListaCompra {
	
	@Id
	@Column(name = "idLista", nullable = false)
	private Long idLista;
	
	@Column(name = "customer_id", nullable = false)
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "Clientes", referencedColumnName = "idCliente")
	private Clientes clientes;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "fechaRegistro")
	private Date fechaRegistro;
	
	@Column(name = "fechaUltimaActualizacion")
	private Date fechaUltimaActualizacion;
	
	@Column(name = "activo")
	private boolean activo;


	

	public Long getIdLista() {
		return idLista;
	}




	public void setIdLista(Long idLista) {
		this.idLista = idLista;
	}




	public Clientes getClientes() {
		return clientes;
	}




	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public Date getFechaRegistro() {
		return fechaRegistro;
	}




	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}




	public Date getFechaUltimaActualizacion() {
		return fechaUltimaActualizacion;
	}




	public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion) {
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
	}




	public boolean isActivo() {
		return activo;
	}




	public void setActivo(boolean activo) {
		this.activo = activo;
	}




	public ListaCompra() {
		super();
		// TODO Auto-generated constructor stub
	}




	public ListaCompra(Long idLista, Clientes clientes, String nombre, Date fechaRegistro,
			Date fechaUltimaActualizacion, boolean activo) {
		super();
		this.idLista = idLista;
		this.clientes = clientes;
		this.nombre = nombre;
		this.fechaRegistro = fechaRegistro;
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
		this.activo = activo;
	}



}
