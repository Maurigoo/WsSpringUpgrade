package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class Main01 {
	
	public static ApplicationContext context;
	
	
	public static void main(String[] args) {
		
		context = new  ClassPathXmlApplicationContext("context01.xml");
		Persona p = (Persona) context.getBean("Juan");
		p.setNombre("Juancho");
		p.setEdad(25);
		p.setPeso(150);
		
		imprimir();
		
		p = context.getBean("Pepe", Persona.class);
		System.out.println(p);
		System.out.println("Fin del programa");
		
	}
	
	private static void imprimir() {
		Persona p = (Persona)context.getBean("Juan");
		System.out.println(p);
	}

}
