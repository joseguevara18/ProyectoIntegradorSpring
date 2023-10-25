package com.gestion.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.gestion.inventario.entity.Productos;

public interface ProductoRepository extends JpaRepository<Productos, Integer>{
	
	

}
