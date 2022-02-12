package com.di.exercisebs21;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService
{
    Person p = new Person();

    public void setNombre(String nombre) { p.setNombre(nombre); }
    public void setPoblacion(String poblacion) { p.setPoblacion(poblacion); }
    public void setEdad(int edad) { p.setEdad(edad); }

    public String getNombre() { return p.getNombre(); }
    public String getPoblacion() { return p.getPoblacion(); }
    public int getEdad() { return p.getEdad(); }
}
