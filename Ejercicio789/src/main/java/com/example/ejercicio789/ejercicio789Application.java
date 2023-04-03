package com.example.ejercicio789;

import com.example.ejercicio789.entidad.Laptop;
import com.example.ejercicio789.repositorio.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ejercicio789Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ejercicio789Application.class, args);
		LaptopRepository laptopRepository=context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"hp","Laptop omen, con 16.1 pul","Negro");
		Laptop laptop2 = new Laptop(null,"hp","Laptop ppp, con 16.1 pul","Azul");

		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);

	}

}
