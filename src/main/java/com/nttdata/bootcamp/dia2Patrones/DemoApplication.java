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
		SingletonPersona singleton = SingletonPersona.getInstance("FOO");
		
		
	}
}
