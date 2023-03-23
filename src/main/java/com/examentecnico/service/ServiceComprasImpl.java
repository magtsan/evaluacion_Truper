package com.examentecnico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examentecnico.entidad.ListaCompra;
import com.examentecnico.entidad.ListaCompraDetalle;
import com.examentecnico.repositorio.RepositorioListaCompra;
import com.examentecnico.repositorio.RepositorioListaCompraDetalles;

@Service
public class ServiceComprasImpl implements ServiceCompras{
	
	@Autowired
	RepositorioListaCompra repositorioListaCompra;
	@Autowired
	RepositorioListaCompraDetalles repositorioListaDetalle;
	
	
	@Override
	public void saveListaCompras(List<ListaCompra> listaCompras) {
		repositorioListaCompra.saveAll(listaCompras);
	}


	@Override
	public void saveListaComprasDetalle(List<ListaCompraDetalle> listaComprasDetalle) {
		repositorioListaDetalle.saveAll(listaComprasDetalle);
	}


	@Override
	public ListaCompra obtenerListaCompra(Long id) {

		return repositorioListaCompra.findById(id).get();
	}


	@Override
	public void saveListaCompra(ListaCompra listaCompra) {
		repositorioListaCompra.save(listaCompra);
		
	}


	@Override
	public void eliminaListaCompra(Long id) {
		repositorioListaCompra.deleteById(id);
		
	}
	
	




}
