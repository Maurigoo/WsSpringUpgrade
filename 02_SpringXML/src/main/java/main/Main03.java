package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Director;
import modelo.entidad.Pelicula;

public class Main03 {
	public static ApplicationContext context;
	public static void main(String[] args) {
		context = new  ClassPathXmlApplicationContext("context03.xml");
		
		Pelicula p =  context.getBean("pelicula", Pelicula.class);
		
		Pelicula p2 = context.getBean("titanic", Pelicula.class);
		p2.getDirector().setEdad(80);
		
		Director d = context.getBean("cameron", Director.class);
		System.out.println(d.getEdad());
		
		
	}

}
