package com.app.web.paciente;

import javax.persistence.Entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table (name = "pacientes")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "cedula",nullable = false, length= 40, unique = true)
	private String cedula;
	
	@Column(name = "nombre",nullable = false, length= 80)
	private String nombre;
	
	@Column(name = "apellido",nullable = false, length= 80)
	private String apellido;
	
	@Column(name = "fechaNacimiento",nullable = false)
	private LocalDate fechaNacimiento;
	
	@Column(name = "edad",nullable = false, length= 5)
	private Number edad;
	
	@Column(name = "fechaCreacion",nullable = false)
	private LocalDate fechaCreacion;
	
	public Paciente() {
		
	}

	public Paciente(Long id, String cedula, String nombre, String apellido, LocalDate fechaNacimiento, Number edad,
			LocalDate fechaCreacion) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.fechaCreacion = fechaCreacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Number getEdad() {
		return edad;
	}

	public void setEdad(Number edad) {
		this.edad = edad;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", fechaCreacion=" + fechaCreacion + "]";
	}
	
}
