package com.di.exercisebs21;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService
{
    Person p = new Person();

    public void setPerson(Person p) { this.p = p; }

    public Person getPerson() { return p; }
}
