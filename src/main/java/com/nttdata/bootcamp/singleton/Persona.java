package com.nttdata.bootcamp.singleton;

public class Persona {
	
	//Atributos
	private String name;
	private int age;

	
	public Persona(String name, int age) {
		this.name = name;
		this.age = age;
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

	
	
}
