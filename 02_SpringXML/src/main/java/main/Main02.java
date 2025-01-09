package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class Main02 {
	public static ApplicationContext context;
	public static void main(String[] args) {
		context = new  ClassPathXmlApplicationContext("context02.xml");
		Persona p = (Persona) context.getBean("personaPrototipada", Persona.class);
		p.setNombre("Juancho");
		System.out.println(p);
		
		p =  (Persona) context.getBean("personaPrototipada", Persona.class);
	}

}
