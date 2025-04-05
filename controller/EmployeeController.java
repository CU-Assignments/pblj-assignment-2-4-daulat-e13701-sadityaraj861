package controller;

import model.Employee;
import model.EmployeeDAO;
import view.EmployeeView;
import java.util.List;

public class EmployeeController {
    private final EmployeeDAO dao;
    private final EmployeeView view;

    public EmployeeController(EmployeeDAO dao, EmployeeView view) {
        this.dao = dao;
        this.view = view;
    }

    public void fetchAndDisplayEmployees() {
        List<Employee> employees = dao.getAllEmployees();
        view.displayEmployees(employees);
    }
}
