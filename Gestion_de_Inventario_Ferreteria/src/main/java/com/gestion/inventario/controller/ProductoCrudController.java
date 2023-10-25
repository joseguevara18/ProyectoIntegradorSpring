package com.gestion.inventario.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.gestion.inventario.entity.Productos;
import com.gestion.inventario.service.ProductoService;
import com.gestion.inventario.util.AppSettings;


@RestController
@RequestMapping("/url/crudProducto")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class ProductoCrudController {

	@Autowired
	private ProductoService service;
	
	
	@GetMapping("/listaProducto")
	@ResponseBody
	public ResponseEntity<List<Productos>> ListarProductos() {
	    List<Productos> lista = null;
	    try {
	        lista = service.listaProductos();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return ResponseEntity.ok(lista);
	}
	
	@PostMapping("/registraProductos")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> insertaProductos(@RequestBody Productos obj) {
		Map<String, Object> salida = new HashMap<>();
		try {
			obj.setCodigo(0);
			
			
			Productos objSalida =  service.insertaActualizaProductos(obj);
			if (objSalida == null) {
				salida.put("mensaje", "No se registró, consulte con el administrador.");
			} else {
				salida.put("mensaje", "Se registró correctamente la Tesis.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje","No se registró, consulte con el administrador.");
		}
		return ResponseEntity.ok(salida);
	}

	
	
	
	@DeleteMapping("/eliminaProductos/{id}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> eliminaTesis(@PathVariable("id") int idProductos) {
		Map<String, Object> salida = new HashMap<>();
		try {
			service.eliminaProductos(idProductos);
			salida.put("mensaje", "Se elimino la Tesis correctamente.");
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "No se eliminó, consulte con el administrador.");
		}
		return ResponseEntity.ok(salida);
	}
	
}
