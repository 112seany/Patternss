package main.java.creational.abstractfactory;

import main.java.creational.abstractfactory.website.WebsiteTeamFactory;

public class BongacamsProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating 18+ site...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
