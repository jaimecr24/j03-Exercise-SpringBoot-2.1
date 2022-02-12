package com.di.exercisebs21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {

    @Autowired PersonService p;

    @GetMapping("/controlador2/getPersona")
    Person getPersona()
    {
        return new Person(p.getNombre(),p.getPoblacion(),p.getEdad()*2);
    }
}
