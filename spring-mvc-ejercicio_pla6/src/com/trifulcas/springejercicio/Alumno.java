package com.trifulcas.springejercicio;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.trifulcas.springejercicio.validation.ValidarDni;

public class Alumno {
	@NotNull
	@Size(min = 2,message = "Debe introducir el nombre del alumno")
	private String nombre;
	
	@ValidarDni 
	private String dni;
	
	@Email(message="email incorrecto")
	private String email;
	
	private String becado;
	private Map<String,String> listaBecados;
	
	private String[] asignaturas;
	private Map<String,String> listaAsignaturas;
	
	
	/*metodos*/
	public Alumno() {
		super();		
		listaAsignaturas=new LinkedHashMap<String,String>();
		listaAsignaturas.put("PHP", "PHP");
		listaAsignaturas.put("JAVA", "JAVA");
		listaAsignaturas.put("JS", "JS");
		listaAsignaturas.put(".NET", ".NET");
		
		listaBecados=new LinkedHashMap<String,String>();
		listaBecados.put("S", "SI");
		listaBecados.put("N", "NO");
	}
	
	public String getNombre() {
	return nombre;
	}
	
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	
	public String getDni() {
	return dni;
	}
	public void setDni(String dni) {
	this.dni = dni;
	}
	
	public String getEmail() {
	return email;
	}
	
	public void setEmail(String email) {
	this.email = email;
	}
	
	public String getBecado() {
	return becado;
	}
	
	public void setBecado (String becado) {
	this.becado = becado;
	}

	public Map<String, String> getListaBecados() {
		return listaBecados;
	}
	
	public String[] getAsignaturas() {
		return asignaturas;
	}
	
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}		
	
	public Map<String, String> getListaAsignaturas() {
		return listaAsignaturas;
		}
}