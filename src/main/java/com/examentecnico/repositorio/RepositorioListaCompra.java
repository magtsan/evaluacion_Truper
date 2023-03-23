package com.examentecnico.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examentecnico.entidad.ListaCompra;

@Repository
public interface RepositorioListaCompra extends JpaRepository<ListaCompra, Long>{

}
