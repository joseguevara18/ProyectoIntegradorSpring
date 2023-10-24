package com.gestion.inventario.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_empleados")
public class Empleados {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer codigo;
	@Column(name = "nombre")
	private String nombreEmpleado;
	@Column(name = "cargo")
	private String cargo;
	@Column(name = "telefono")
	private String telefonoEmpleado;
	@Column(name = "email")
	private String emailEmpleado;
	
	@OneToMany(mappedBy = "empleado")
	private List<Ventas> ventas;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getTelefonoEmpleado() {
		return telefonoEmpleado;
	}
	public void setTelefonoEmpleado(String telefonoEmpleado) {
		this.telefonoEmpleado = telefonoEmpleado;
	}
	public String getEmailEmpleado() {
		return emailEmpleado;
	}
	public void setEmailEmpleado(String emailEmpleado) {
		this.emailEmpleado = emailEmpleado;
	}
	
	
	
	
	
}
