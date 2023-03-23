package com.examentecnico.service;

import java.util.List;

import com.examentecnico.entidad.ListaCompra;
import com.examentecnico.entidad.ListaCompraDetalle;


public interface ServiceCompras {
	
	public void saveListaCompras(List<ListaCompra> listaCompras);
	
	public void saveListaCompra(ListaCompra listaCompra);
	
	public void saveListaComprasDetalle(List<ListaCompraDetalle> listaComprasDetalle);
	
	public ListaCompra obtenerListaCompra(Long id);
	
	public void eliminaListaCompra(Long id);
	

}
