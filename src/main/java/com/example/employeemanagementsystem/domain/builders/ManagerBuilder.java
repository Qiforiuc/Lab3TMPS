package com.example.employeemanagementsystem.domain.builders;

import com.example.employeemanagementsystem.domain.models.Manager;

public class ManagerBuilder {
  private String name;
  private double salary;
  int id;

  public ManagerBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public ManagerBuilder setSalary(double salary) {
    this.salary = salary;
    return this;
  }

  public Manager build() {
    return new Manager(id, name, salary);
  }
}
