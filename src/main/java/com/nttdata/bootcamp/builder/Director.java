package com.nttdata.bootcamp.builder;

public class Director {
	  public void createEmpleado1(Builder builder) {
		    builder.setEmpleadoApellido("Fernandez");
		    builder.setEmpleadoNombre("Juan");
		    builder.setEmpleadoDNI("172189E");
		    builder.setEmpleadoSueldo(1300.89);
	  }
	  public void createEmpleado2(Builder builder) {
		    builder.setEmpleadoApellido("Denares");
		    builder.setEmpleadoNombre("Lucia");
		    builder.setEmpleadoDNI("291831R");
		    builder.setEmpleadoSueldo(1600.72);
	  }
	  public void createEmpleado3(Builder builder) {
		    builder.setEmpleadoApellido("Heisen");
		    builder.setEmpleadoNombre("María");
		    builder.setEmpleadoDNI("893211A");
		    builder.setEmpleadoSueldo(2000.70);
	  }
	  public void createEmpleado4(Builder builder) {
		    builder.setEmpleadoApellido("Jimenez");
		    builder.setEmpleadoNombre("Manolo");
		    builder.setEmpleadoDNI("337324P");
		    builder.setEmpleadoSueldo(1600.72);
	  }
	}
