package com.example.Ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public NotificationService(){
        System.out.println("Estamos en NotificationService");
    }

    public String saludo(){
        return "Hola Amigos";

    }
}
