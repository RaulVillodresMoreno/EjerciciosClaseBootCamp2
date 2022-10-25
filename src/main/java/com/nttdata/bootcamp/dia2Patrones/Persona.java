package com.nttdata.bootcamp.dia2Patrones;

import com.nttdata.bootcamp.IClonable.IClonable;

public class Persona implements IClonable{
	
	//Atributos
	private String name;
	private int age;

	
	public Persona(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Persona() {
		
	}
	
	public Persona(Persona persona) {
	
	}

	//Getters y Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Persona clone() {
		Persona person = new Persona();
		person.setName(this.getName());
		person.setAge(this.getAge());
		return person;
	}

	
	
}
