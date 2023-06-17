package main.java.creational.abstractfactory;

import main.java.creational.abstractfactory.banking.BankingTeamFactory;

public class MonobankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system....");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
