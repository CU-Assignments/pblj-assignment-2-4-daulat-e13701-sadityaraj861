package view;

import model.Employee;
import java.util.List;

public class EmployeeView {
    public void displayEmployees(List<Employee> employees) {
        System.out.println("EmpID\tName\t\tSalary");
        System.out.println("------\t----\t\t------");
        for (Employee e : employees) {
            System.out.println(e.getEmpID() + "\t" + e.getName() + "\t\t" + e.getSalary());
        }
    }
}
