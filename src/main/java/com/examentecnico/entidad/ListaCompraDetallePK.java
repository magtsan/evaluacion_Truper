package com.examentecnico.entidad;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Embeddable
public class ListaCompraDetallePK {
	
	@Column(name = "idListaCompra", nullable = false)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ListaCompra", referencedColumnName = "idLista")
	private Long idListaCompra;
	
	@Column(name = "codigoProducto", nullable = false)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Productos", referencedColumnName = "idProducto")
	private Long codigoProducto;
	
	
	public Long getIdListaCompra() {
		return idListaCompra;
	}
	public void setIdListaCompra(Long idListaCompra) {
		this.idListaCompra = idListaCompra;
	}
	public Long getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public ListaCompraDetallePK(Long idListaCompra, Long codigoProducto) {
		super();
		this.idListaCompra = idListaCompra;
		this.codigoProducto = codigoProducto;
	}
	public ListaCompraDetallePK() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	

}
