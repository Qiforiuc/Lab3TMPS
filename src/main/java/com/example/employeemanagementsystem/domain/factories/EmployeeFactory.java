package com.example.employeemanagementsystem.domain.factories;

import com.example.employeemanagementsystem.domain.models.Developer;
import com.example.employeemanagementsystem.domain.models.Employee;
import com.example.employeemanagementsystem.domain.models.Manager;

public class EmployeeFactory {
  public Employee createEmployee(String type,int id, String name, double salary) {
    switch (type.toLowerCase()) {
      case "developer":
        return new Developer(id, name, salary);
      case "manager":
        return new Manager(id, name, salary);
      default:
        throw new IllegalArgumentException("Invalid employee type: " + type);
    }
  }
}
