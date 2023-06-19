package main.java.structural.bridge;

public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    public void developProgram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();
    }
}
