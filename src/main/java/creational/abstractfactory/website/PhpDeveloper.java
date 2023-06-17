package main.java.creational.abstractfactory.website;

import main.java.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code....");
    }
}
