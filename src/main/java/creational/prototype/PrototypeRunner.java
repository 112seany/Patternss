package main.java.creational.prototype;

import java.util.List;

public class PrototypeRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        Employees emp1 = (Employees) emps.clone();
        Employees emp2 = (Employees) emps.clone();
        List<String> list = emp1.getEmpList();
        list.add("Sexgay");
        List<String> list1 = emp2.getEmpList();
        list1.remove("David");

        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("emp1 List: "+emp1.getEmpList());
        System.out.println("emp2 List: "+emp2.getEmpList());
    }
}
