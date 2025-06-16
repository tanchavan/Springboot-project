package com.MySpringBootApp.Entity;

import java.util.List;

public interface EmployeeDAO {
    void save(Employee employee);

    Employee findById(int id);

    void deleteById(int id);

    List<Employee> findAll();

    // Additional methods can be defined here as needed

}
