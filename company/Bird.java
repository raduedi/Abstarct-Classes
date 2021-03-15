package com.company;

import java.sql.SQLOutput;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breath() {
        System.out.println(getName() + " is breathing");
    }

    @Override
    public void fly(){
        System.out.println(getName() + "its flapping its wings !");
    }
}
