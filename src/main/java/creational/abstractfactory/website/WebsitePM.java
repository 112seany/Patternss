package main.java.creational.abstractfactory.website;

import main.java.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project....");
    }
}
