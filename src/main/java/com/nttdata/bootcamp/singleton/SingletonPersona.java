package com.nttdata.bootcamp.singleton;

public class SingletonPersona {
	
	//Atributos
	private static SingletonPersona singletonPersona;
		private String name;
		private int age;
		private SingletonPersona() {
			
		}
		
		public static SingletonPersona getInstance() {
			if(singletonPersona == null) {
				singletonPersona = new SingletonPersona();
			}
			
			return singletonPersona;
		}
		
		public void singletonPersona() {
			System.out.println("Soy un ejemplo de persona");
			System.out.printf("Mi nombre es %s y mi edad es %d%n", name, age);
		}
	
}
