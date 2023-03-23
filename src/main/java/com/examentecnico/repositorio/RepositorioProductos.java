package com.examentecnico.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examentecnico.entidad.Productos;

@Repository
public interface RepositorioProductos extends JpaRepository<Productos, Long> {

}
