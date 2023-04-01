package com.example.Ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        System.out.println("Estamos en UserService");
        this.notificationService=notificationService;
    }
}
