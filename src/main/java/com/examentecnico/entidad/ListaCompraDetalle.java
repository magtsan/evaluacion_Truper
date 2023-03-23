package com.examentecnico.entidad;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ListaCompraDetalle")
public class ListaCompraDetalle {
	
	
	@EmbeddedId
    private ListaCompraDetallePK listaCompraDetallePK;
	
	@Column(name = "idListaCompra", nullable = false)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ListaCompra", referencedColumnName = "idLista")
	private ListaCompra listaCompra;
	
	@Column(name = "idCodigoProducto", nullable = false)
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "Productos", referencedColumnName = "idProducto")
	private Productos productos;
	
	@Column(name = "cantidad")
	private int cantidad;
	

}
