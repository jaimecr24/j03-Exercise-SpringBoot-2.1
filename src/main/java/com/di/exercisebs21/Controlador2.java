package com.di.exercisebs21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {

    @Autowired PersonServiceImp p;

    @GetMapping("/controlador2/getPersona")
    Person getControlador2()
    {
        Person p2 = p.getPerson();
        return new Person(p2.getNombre(),p2.getPoblacion(),p2.getEdad()*2);
    }
}
