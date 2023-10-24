package com.gestion.inventario.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_productos")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer codigo;
	@Column(name = "nombre")
	private String nombreProducto;
	@Column(name = "descripcion")
	private String decripcionProducto;
	@Column(name = "precio")
	private Double precioPro;
	@Column(name = "cantidad")
	private int cantidadPro;
	@Column(name = "categoria")
	private String categoriaPro;
	@Column(name  = "fecha_ingreso")
	private LocalDate fecha;
	@Column(name = "codigo_barras")
	private String codigoBarras;
	@Column(name = "ubicacion_en_almacen")
	private String ubicacion;
	
	@ManyToOne
	@JoinColumn(name = "proveedor_id")	
	private Proveedor proveedor;
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getDecripcionProducto() {
		return decripcionProducto;
	}
	public void setDecripcionProducto(String decripcionProducto) {
		this.decripcionProducto = decripcionProducto;
	}
	public Double getPrecioPro() {
		return precioPro;
	}
	public void setPrecioPro(Double precioPro) {
		this.precioPro = precioPro;
	}
	public int getCantidadPro() {
		return cantidadPro;
	}
	public void setCantidadPro(int cantidadPro) {
		this.cantidadPro = cantidadPro;
	}
	public String getCategoriaPro() {
		return categoriaPro;
	}
	public void setCategoriaPro(String categoriaPro) {
		this.categoriaPro = categoriaPro;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	
} 
