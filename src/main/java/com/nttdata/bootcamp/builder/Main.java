package com.nttdata.bootcamp.builder;

public class Main {
	public static void main(String[] args) {
	    Director director = new Director();
	    // The client wants a simple and small car
	    EmpleadoBuilder builder = new EmpleadoBuilder();
	    director.createEmpleado1(builder);
	    Empleado empleado1 = builder.getEmpleado();
	    director.createEmpleado2(builder);
	    Empleado empleado2 = builder.getEmpleado();
	    director.createEmpleado3(builder);
	    Empleado empleado3 = builder.getEmpleado();
	    director.createEmpleado4(builder);
	    Empleado empleado4 = builder.getEmpleado();

	    System.out.println(empleado1.toString());
	    System.out.println(empleado2.toString());
	    System.out.println(empleado3.toString());
	    System.out.println(empleado4.toString());
	  }
}
