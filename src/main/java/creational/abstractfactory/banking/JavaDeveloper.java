package main.java.creational.abstractfactory.banking;

import main.java.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code....");
    }
}
