package com.example.employeemanagementsystem.data;

import com.example.employeemanagementsystem.domain.models.Employee;
import java.util.HashMap;
import java.util.Map;

public class PerformanceReviewSystem {
  private Map<Employee, String> performanceReviews;

  public PerformanceReviewSystem() {
    this.performanceReviews = new HashMap<>();
  }

  public void addPerformanceReview(Employee employee, String review) {
    performanceReviews.put(employee, review);
  }

  public String getPerformanceReview(Employee employee) {
    return performanceReviews.get(employee);
  }
}