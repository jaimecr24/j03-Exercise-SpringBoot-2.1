package com.di.exercisebs21;

public interface PersonService
{
    void setPerson(String nombre, String poblacion, int edad);
    String getNombre();
    String getPoblacion();
    int getEdad();
}
