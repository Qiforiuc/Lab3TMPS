package com.example.employeemanagementsystem.domain.decorators;

import com.example.employeemanagementsystem.domain.models.Employee;

public class PerformanceReviewDecorator implements Employee {
  private Employee employee;
  private String performanceReview;

  public PerformanceReviewDecorator(Employee employee, String performanceReview) {
    this.employee = employee;
    this.performanceReview = performanceReview;
  }

  public String getName() {
    return employee.getName();
  }

  public double getSalary() {
    return employee.getSalary();
  }

  public void setName(String name) {
    employee.setName(name);
  }

  public void setSalary(double salary) {
    employee.setSalary(salary);
  }

  public String getPerformanceReview() {
    return performanceReview;
  }

  public int getId(){return employee.getId();}
  public void setPerformanceReview(String performanceReview) {
    this.performanceReview = performanceReview;
  }
}
