package com.example.employeemanagementsystem.client;

import com.example.employeemanagementsystem.data.EmployeeRepository;
import com.example.employeemanagementsystem.data.PayrollSystem;
import com.example.employeemanagementsystem.data.PerformanceReviewSystem;
import com.example.employeemanagementsystem.domain.models.Employee;
import java.util.List;

public class EmployeeManagementSystem {
  private EmployeeRepository employeeRepository;
  private PayrollSystem payrollSystem;
  private PerformanceReviewSystem performanceReviewSystem;

  public EmployeeManagementSystem(EmployeeRepository employeeRepository, PayrollSystem payrollSystem, PerformanceReviewSystem performanceReviewSystem) {
    this.employeeRepository = employeeRepository;
    this.payrollSystem = payrollSystem;
    this.performanceReviewSystem = performanceReviewSystem;
  }

  public List<Employee> getEmployees() {
    return employeeRepository.getEmployees();
  }

  public Employee getEmployeeById(int id) {
    return employeeRepository.getEmployeeById(id);
  }

  public void addEmployee(Employee employee) {
    employeeRepository.addEmployee(employee);
  }

  public void removeEmployee(Employee employee) {
    employeeRepository.removeEmployee(employee);
  }

  public void payEmployees() {
    payrollSystem.payEmployees(getEmployees());
  }

  public void addPerformanceReview(Employee employee, String review) {
    performanceReviewSystem.addPerformanceReview(employee, review);
  }

  public String getPerformanceReview(Employee employee) {
    return performanceReviewSystem.getPerformanceReview(employee);
  }

  public void giveRaise(Employee employee, double amount) {
    double currentSalary = employee.getSalary();
    employee.setSalary(currentSalary + amount);
  }

  public void giveRaises(List<Employee> employees, double amount) {
    for (Employee employee : employees) {
      double currentSalary = employee.getSalary();
      employee.setSalary(currentSalary + amount);
    }
  }
}
