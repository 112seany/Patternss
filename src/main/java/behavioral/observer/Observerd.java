package main.java.behavioral.observer;

public interface Observerd {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
