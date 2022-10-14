package com.cirbal.app.productos.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cirbal.app.productos.models.entity.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

	
}
