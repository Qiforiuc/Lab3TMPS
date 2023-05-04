package com.example.employeemanagementsystem.domain.models;

import java.util.Collections;
import java.util.List;

public class Developer implements Employee {
  private String name;
  private double salary;
  private int id;
  public Developer(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void add(Employee employee) {
    // Leaf nodes don't have subordinates
  }

  public void remove(Employee employee) {
    // Leaf nodes don't have subordinates
  }

  public List<Employee> getSubordinates() {
    // Leaf nodes don't have subordinates
    return Collections.emptyList();
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  @Override
  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}