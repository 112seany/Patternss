package main.java.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepository githubRepository = new GithubRepository();

        System.out.println("Creating new project Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to github...");
        githubRepository.setSave(project.save());

        System.out.println("Updating project to Version 1.1");

        System.out.println("Writing code...");
        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong...");

        System.out.println("Rolling back to version 1.0");
        project.load(githubRepository.getSave());

        System.out.println("Project after rollback:");
        System.out.println(project);
    }
}
