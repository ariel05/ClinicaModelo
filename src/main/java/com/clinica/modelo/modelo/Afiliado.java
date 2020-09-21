package com.clinica.modelo.modelo;

import java.io.Serializable;

public class Afiliado extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -286771264312382945L;

	private Long id;
	private String patologia;
	private String plan;
	private String credenciales;
	private String fechaBaja;
	
	public Afiliado() {
		super();
	}
	
	public Afiliado(String nombre, String apellido, String dni) {
		super(nombre, apellido, dni);
	}
	
	public Afiliado(Long id, String patologia, String plan, String credenciales, String nombre, String apellido, String dni) {
		super(nombre, apellido, dni);
		this.id = id;
		this.patologia = patologia;
		this.plan = plan;
		this.credenciales = credenciales;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPatologia() {
		return patologia;
	}
	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getCredenciales() {
		return credenciales;
	}
	public void setCredenciales(String credenciales) {
		this.credenciales = credenciales;
	}
	public String getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
}
