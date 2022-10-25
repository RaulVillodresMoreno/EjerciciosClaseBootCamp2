package com.nttdata.bootcamp.builder;

public class Empleado {
	private String apellidos;
	private String nombre;
	private String DNI;
	private Double sueldo;
	private int experienciaLaboral;
	
	//Constructor
	public Empleado(String apellidos, String nombre, String dNI, Double sueldo, int experienciaLaboral) {
		super();
		this.apellidos = apellidos;
		this.nombre = nombre;
		DNI = dNI;
		this.sueldo = sueldo;
		this.experienciaLaboral = experienciaLaboral;
	}
	
	//Getters y Setters
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public int getExperienciaLaboral() {
		return experienciaLaboral;
	}
	public void setExperienciaLaboral(int experienciaLaboral) {
		this.experienciaLaboral = experienciaLaboral;
	}

	@Override
	public String toString() {
		return "apellidos=" + apellidos + ", nombre=" + nombre + ", DNI=" + DNI + ", sueldo=" + sueldo
				+ ", experienciaLaboral=" + experienciaLaboral;
	}
	
	
	
	
}
