package com.example.Ejercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Ejercicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext
				(new String[] {"beans.xml"});
		Saludo saludo = (Saludo) context.getBean("saludo");
		String salu = saludo.imprimirSaludo();
		System.out.println(salu);
	}

}
