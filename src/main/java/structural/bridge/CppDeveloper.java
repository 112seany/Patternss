package main.java.structural.bridge;

public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.printf("C++ developer writes C++ code...");
    }
}
