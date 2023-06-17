package main.java.creational.abstractfactory.banking;

import main.java.creational.abstractfactory.Developer;
import main.java.creational.abstractfactory.ProjectManager;
import main.java.creational.abstractfactory.ProjectTeamFactory;
import main.java.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingProjectManager();
    }
}
