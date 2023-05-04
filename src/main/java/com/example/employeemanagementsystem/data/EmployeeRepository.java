package com.example.employeemanagementsystem.data;

import com.example.employeemanagementsystem.domain.models.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
  private List<Employee> employees;

  public EmployeeRepository() {
    this.employees = new ArrayList<>();
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public Employee getEmployeeById(int id) {
    for (Employee employee : employees) {
      // Assuming each employee has a unique id
      if (employee.getId() == id) {
        return employee;
      }
    }

    return null;
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public void removeEmployee(Employee employee) {
    employees.remove(employee);
  }
}
