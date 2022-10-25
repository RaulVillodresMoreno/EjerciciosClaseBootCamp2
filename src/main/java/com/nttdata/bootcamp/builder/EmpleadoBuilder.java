package com.nttdata.bootcamp.builder;

public class EmpleadoBuilder implements Builder {

	private String apellido;
	private String nombre;
	private String DNI;
	private Double sueldo;
	private int experienciaLaboral;
	
	@Override
	public void setEmpleadoApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public void setEmpleadoNombre(String nombre) {
		this.nombre = nombre;
		
	}

	@Override
	public void setEmpleadoDNI(String DNI) {
		this.DNI = DNI;
	}

	@Override
	public void setEmpleadoSueldo(Double sueldo) {
		this.sueldo = sueldo;
		
	}

	@Override
	public void setEmpleadoExperienciaLaboral(int experienciaLaboral) {
		this.experienciaLaboral = experienciaLaboral;
		
	}
	
	public Empleado getEmpleado() {
	    return new Empleado(apellido, nombre, DNI, sueldo, experienciaLaboral);
	  }
	
}
