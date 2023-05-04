package com.example.employeemanagementsystem.utilities;

import com.example.employeemanagementsystem.utilities.Department;
import java.util.HashMap;
import java.util.Map;

public class DepartmentCache {
  private static final Map<String, Department> departments = new HashMap<>();

  public static Department getDepartment(String name, String description) {
    Department department = departments.get(name);

    if (department == null) {
      department = new Department(name, description);
      departments.put(name, department);
    }

    return department;
  }
}