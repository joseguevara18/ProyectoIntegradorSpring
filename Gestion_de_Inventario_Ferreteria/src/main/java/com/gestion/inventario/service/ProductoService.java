package com.gestion.inventario.service;

import java.util.List;



import com.gestion.inventario.entity.Productos;

public interface ProductoService {

	public abstract Productos insertaActualizaProductos(Productos obj);
	public abstract List<Productos> listaProductos();
	public abstract void eliminaProductos(int idProductos);
}
