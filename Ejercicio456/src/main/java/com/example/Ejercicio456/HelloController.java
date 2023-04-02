package com.example.Ejercicio456;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value="saludo")
    public String saludo(){
        return "Hola amigos buenos dias";
    }
}
