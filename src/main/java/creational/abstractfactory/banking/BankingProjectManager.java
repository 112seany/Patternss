package main.java.creational.abstractfactory.banking;

import main.java.creational.abstractfactory.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project....");
    }
}
