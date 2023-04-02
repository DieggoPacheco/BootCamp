package com.example.Ejercicio456;

import com.example.Ejercicio456.entidad.Laptop;
import com.example.Ejercicio456.repositorio.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio456Application {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Ejercicio456Application.class, args);
		LaptopRepository laptopRepository=context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"hp","Laptop omen, con 16.1 pul","Negro");
		Laptop laptop2 = new Laptop(null,"hp","Laptop ppp, con 16.1 pul","Azul");

		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);

	}

}
