package com.cirbal.app.productos.models.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cirbal.app.productos.models.entity.Producto;


public interface IProductoService {
	public List<Producto> findAll();
	public Producto findById(Long id);
//	public Producto findName(String name);
}
