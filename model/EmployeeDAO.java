package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private final String url = "jdbc:mysql://localhost:3306/companydb";
    private final String user = "Aditya861";
    private final String password = "A1di@1234";

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM Employee";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int empID = rs.getInt("EmpID");
                String name = rs.getString("Name");
                double salary = rs.getDouble("Salary");
                employees.add(new Employee(empID, name, salary));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }

        return employees;
    }
}
