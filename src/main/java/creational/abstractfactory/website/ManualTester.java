package main.java.creational.abstractfactory.website;

import main.java.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website");
    }
}
