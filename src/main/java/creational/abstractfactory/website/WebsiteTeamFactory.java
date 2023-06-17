package main.java.creational.abstractfactory.website;

import main.java.creational.abstractfactory.Developer;
import main.java.creational.abstractfactory.ProjectManager;
import main.java.creational.abstractfactory.ProjectTeamFactory;
import main.java.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
