package com.cirbal.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cirbal.app.productos.models.entity.Producto;
import com.cirbal.app.productos.models.repository.ProductoRepository;
@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private ProductoRepository productorRepository;
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		
		return (List<Producto>) productorRepository.findAll();
	}

	

//
//	@Override
//	public Producto findName(String name) {
//		// TODO Auto-generated method stub
//		return productorRepository.findName(name);
//	}




	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
	
		return productorRepository.findById(id).orElse(null);
	}



}
