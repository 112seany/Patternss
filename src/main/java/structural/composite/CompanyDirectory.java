package main.java.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {
    private List<Employee> employeeList = new ArrayList<Employee>();
    @Override
    public void showEmployeeDetalis() {
        for(Employee emp: employeeList)
        {
            emp.showEmployeeDetalis();
        }
    }

    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }

    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }
}
