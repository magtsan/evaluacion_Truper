package com.examentecnico.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examentecnico.entidad.Clientes;

@Repository
public interface RepositorioClientes extends JpaRepository<Clientes, Long> {
	
	

}
