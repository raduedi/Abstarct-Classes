package com.company;

public class Main {

    public static void main(String[] args) {
Dog dog = new Dog("Yorkie");
dog.breath();
dog.eat();

Parrot parrot = new Parrot("Birdie");
parrot.breath();
parrot.eat();
parrot.fly();

Penguin penguin = new Penguin("Pini");
penguin.fly();
    }
}
