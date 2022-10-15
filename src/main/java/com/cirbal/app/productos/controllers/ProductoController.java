package com.cirbal.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cirbal.app.productos.models.entity.Producto;
import com.cirbal.app.productos.models.service.IProductoService;

@RestController
public class ProductoController {
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/list")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	@GetMapping("/ver/{id}")
	//Con la anotacion @PathVariable podremos pasarle 
	//como parametro a la url el id del objeto

	public Producto detalle(@PathVariable Long id) {
		return productoService.findById(id);
	}
}

