package com.di.exercisebs21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {

    @Autowired PersonServiceImp p;

    @GetMapping("/controlador1/useradd")
    public Person addPerson(@RequestHeader String nombre, @RequestHeader String poblacion, @RequestHeader int edad)
    {
        p.setPerson(nombre,poblacion,edad);
        return new Person(nombre,poblacion,edad);
    }
}
