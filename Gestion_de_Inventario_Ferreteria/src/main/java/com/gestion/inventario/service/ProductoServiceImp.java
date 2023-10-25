package com.gestion.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gestion.inventario.entity.Productos;
import com.gestion.inventario.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService{

	@Autowired	
	private ProductoRepository repository;

	@Override
	public Productos insertaActualizaProductos(Productos obj) {
		return repository.save(obj);
	}
	
	@Override
	public List<Productos> listaProductos() {
		return repository.findAll();
	}
	
	@Override
	public void eliminaProductos(int idProductos) {
		// TODO Auto-generated method stub
		repository.deleteById(idProductos);
		
	}
}
