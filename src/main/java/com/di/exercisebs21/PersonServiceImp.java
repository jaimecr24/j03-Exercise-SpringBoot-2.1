package com.di.exercisebs21;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService
{
    Person p = new Person();

    public void setPerson(String nombre, String poblacion, int edad)
    {
        p.setNombre(nombre);
        p.setPoblacion(poblacion);
        p.setEdad(edad);
    }

    public String getNombre() {
        return p.getNombre();
    }

    public String getPoblacion() {
        return p.getPoblacion();
    }

    public int getEdad() {
        return p.getEdad();
    }
}
