package com.examentecnico.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examentecnico.entidad.ListaCompraDetalle;
import com.examentecnico.entidad.ListaCompraDetallePK;

@Repository
public interface RepositorioListaCompraDetalles extends JpaRepository<ListaCompraDetalle, ListaCompraDetallePK> {

}
