package main.java.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/112seany/Paterns");
        project.run();
    }
}
