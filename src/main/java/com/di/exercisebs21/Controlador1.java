package com.di.exercisebs21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {

    @Autowired PersonService p;

    @GetMapping("/controlador1/addPersona")
    public Object addPersona(@RequestHeader String nombre, @RequestHeader String poblacion, @RequestHeader int edad)
    {
        p.setNombre(nombre);
        p.setPoblacion(poblacion);
        p.setEdad(edad);

        return new Person(nombre,poblacion,edad);
    }
}
