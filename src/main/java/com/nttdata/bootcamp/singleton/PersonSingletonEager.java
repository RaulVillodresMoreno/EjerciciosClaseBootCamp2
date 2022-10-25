package com.nttdata.bootcamp.singleton;

import com.nttdata.bootcamp.dia2Patrones.Persona;

public class PersonSingletonEager {
	public static final Persona Instance = new Persona();
	
	private PersonSingletonEager() {
		super();
	}
}
