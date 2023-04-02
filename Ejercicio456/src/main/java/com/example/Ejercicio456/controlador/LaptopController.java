package com.example.Ejercicio456.controlador;

import com.example.Ejercicio456.entidad.Laptop;
import com.example.Ejercicio456.repositorio.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping(value="/laptos")
    public List<Laptop> laptos(){
        return laptopRepository.findAll();
    }

    @GetMapping(value="/lapto/{id}")
    public ResponseEntity<Laptop> unLaptop(@PathVariable Long id){
        Optional<Laptop> laptopOpt = laptopRepository.findById(id);
        if(laptopOpt.isPresent())
            return ResponseEntity.ok(laptopOpt.get());
        else
            return ResponseEntity.notFound().build();
    }

    @PostMapping(value="/laptos")
    public Laptop crear(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }

}
