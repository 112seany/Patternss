package main.java.structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = null;
        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}
