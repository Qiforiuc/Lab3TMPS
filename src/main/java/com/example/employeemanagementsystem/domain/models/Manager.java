package com.example.employeemanagementsystem.domain.models;

import com.example.employeemanagementsystem.domain.models.Employee;
import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
  private String name;
  private double salary;
  private int id;
  private List<Employee> subordinates;

  public Manager(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.subordinates = new ArrayList<>();
  }

  public void add(Employee employee) {
    subordinates.add(employee);
  }

  public void remove(Employee employee) {
    subordinates.remove(employee);
  }

  public List<Employee> getSubordinates() {
    return subordinates;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public int getId()
  {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}