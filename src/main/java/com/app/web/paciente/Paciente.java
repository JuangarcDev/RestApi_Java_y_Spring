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

	@Column(name = "cedula",nullable = false, length= 40)
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
	
}
