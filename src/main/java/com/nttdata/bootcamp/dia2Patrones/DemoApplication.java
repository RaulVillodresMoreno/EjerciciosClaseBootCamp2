package com.nttdata.bootcamp.dia2Patrones;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.singleton.SingletonPersona;

//-----------------------------------
//MI NOMBRE ES RAÚL VILLODRES MORENO
//-----------------------------------
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Persona persona = new Persona("Prueba", 11);
		Persona persona2 = persona.clone();
		
		persona2.setName("prueba2");
		
		System.out.println("Persona 1:" + persona.getName());
		System.out.println("Persona 2: " + persona2.getName());
		
		
	}
}
