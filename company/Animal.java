package com.company;

public abstract class Animal { // we cannot instantiet an abstract class directly
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breath();

    public String getName(){
        return name;
    }
}
