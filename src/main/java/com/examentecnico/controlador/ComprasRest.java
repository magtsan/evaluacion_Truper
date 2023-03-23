package com.examentecnico.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examentecnico.entidad.ListaCompra;
import com.examentecnico.entidad.ListaCompraDetalle;
import com.examentecnico.service.ServiceCompras;

@RestController
public class ComprasRest {
	
	
	@Autowired
	ServiceCompras service;
	
	
	@PostMapping("/guardaListaCompras")
	public String guardarListaCompras(@RequestBody List<ListaCompraDetalle> listaCompraDetalle) {
		service.saveListaComprasDetalle(listaCompraDetalle);
		return "lista Guardada";
		
	}
	
	@GetMapping("/obtenerCompra/{id}")
	public ListaCompra obtenerListaCompra(@RequestAttribute Long id){
		
		return service.obtenerListaCompra(id);
		
	}
	
	@PutMapping("/actualizaPrecios/{id}")
	public String actualizaLista(@RequestAttribute Long id, @RequestBody List<ListaCompraDetalle> listaDetalles) {
		
		ListaCompra listaCompra = service.obtenerListaCompra(id);
		
		listaCompra.setNombre("Lista Actualizada");
		
		service.saveListaCompra(listaCompra);
		
		service.saveListaComprasDetalle(listaDetalles);
		
		
		return "Lista Actualizada";
	}
	
	@DeleteMapping("/borraListaCompras/{id}")
	public String borraListaCompras(@RequestAttribute Long id){
		
		service.eliminaListaCompra(id);
		
		return "Lista eliminada";
	}
	
	
	
	

}
