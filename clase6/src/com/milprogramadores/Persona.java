package com.milprogramadores;

public class Persona {

	// <encapsulamiento> <tipoDeDato> <nombreAtributo>
	private String nombre;
	private String apellido;
	private int edad;
	private Direccion direccion;
	
	//metodos setter -> para setear la informacion
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	//metodos getter -> para conocer la informacion
	public String getNombre() {
		return nombre;
	}
	
	// <encapsulamiento> <tipoRetorno> <nombreMetodo>( <parametros>){ ... }
	public void cambiarNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public String dimeTuNombre() {
		return nombre;
	}
	
	public void respirar() {
		System.out.println("Estoy respirando");
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}

