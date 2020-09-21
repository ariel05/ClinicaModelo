package com.clinica.modelo.modelo;

import java.io.Serializable;

public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1049015292122231760L;
	
	private Long id;
	private String nombre;
	private String apellido;
	private String tipoDni;
	private String dni;
	private String domicilio;
	private String fechaNacimiento;
	private String sexo;

	public Persona() {}

	public Persona(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public Persona(Long id, String nombre, String apellido, String tipoDni, String dni, String domicilio,
			String fechaNacimiento, String sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDni = tipoDni;
		this.dni = dni;
		this.domicilio = domicilio;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
	}



	public String getTipoDni() {
		return tipoDni;
	}

	public void setTipoDni(String tipoDni) {
		this.tipoDni = tipoDni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	};
	
}
