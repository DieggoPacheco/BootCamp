package com.example.Ejercicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Ejercicio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio2Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext
				(new String[] {"beans.xml"});

		UserService user = (UserService) context.getBean("userService");
		System.out.println(user.notificationService.saludo());

		NotificationService notificationService= (NotificationService) context.getBean("notificationService");;
		String cadena = notificationService.saludo();
		System.out.println(cadena);


	}

}
