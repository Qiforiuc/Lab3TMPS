package com.example.employeemanagementsystem.domain.decorators;

import com.example.employeemanagementsystem.domain.models.Employee;

public interface EmployeeDecorator extends Employee {
  // This interface extends the base com.example.employeemanagementsystem.domain.models.Employee interface and adds additional methods.
  // The concrete decorators will implement these methods.

  public void setPerformanceReview(String performanceReview);
  public String getPerformanceReview();
}