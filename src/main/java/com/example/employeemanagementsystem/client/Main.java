package com.example.employeemanagementsystem.client;

import com.example.employeemanagementsystem.data.EmployeeRepository;
import com.example.employeemanagementsystem.data.PayrollSystem;
import com.example.employeemanagementsystem.data.PerformanceReviewSystem;
import com.example.employeemanagementsystem.domain.builders.ManagerBuilder;
import com.example.employeemanagementsystem.domain.decorators.PerformanceReviewDecorator;
import com.example.employeemanagementsystem.domain.models.Developer;
import com.example.employeemanagementsystem.domain.models.Employee;
import com.example.employeemanagementsystem.domain.models.Manager;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Create some employees
    Employee john = new Developer(1,"John Doe", 50000);
    ManagerBuilder managerBuilder = new ManagerBuilder();
    Manager jane = managerBuilder.setName("Jane Smith").setSalary(80000).build();

    // Add employees to the repository
    EmployeeRepository repository = new EmployeeRepository();
    repository.addEmployee(john);
    repository.addEmployee(jane);

    // Add performance review for employee John
    PerformanceReviewDecorator johnWithReview = new PerformanceReviewDecorator(john, "John is a top performer");
    PerformanceReviewSystem reviewSystem = new PerformanceReviewSystem();
    reviewSystem.addPerformanceReview(johnWithReview, johnWithReview.getPerformanceReview());

    // Use the com.example.employeemanagementsystem.client.EmployeeManagementSystem facade to manage employees
    EmployeeManagementSystem ems = new EmployeeManagementSystem(repository, new PayrollSystem(), reviewSystem);
    List<Employee> employees = ems.getEmployees();

    System.out.println("All employees:");
    for (Employee employee : employees) {
      System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
    }

    Employee employeeById = ems.getEmployeeById(1);
    System.out.println("com.example.employeemanagementsystem.domain.models.Employee with id 1: Name: " + employeeById.getName() + ", Salary: " + employeeById.getSalary());

    ems.giveRaise(jane, 5000);
    System.out.println("New salary for Jane: " + jane.getSalary());

    ems.giveRaises(employees, 1000);
    System.out.println("All employees after giving raises:");
    for (Employee employee : employees) {
      System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
    }

    ems.payEmployees();
    System.out.println("Employees have been paid");
  }
}
