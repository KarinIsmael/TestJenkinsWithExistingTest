package com.example;

import java.util.List;

public class TestEmployeeRepository implements EmployeeRepository {
    @Override
    public List<Employee> findAll() {
        return List.of(new Employee("2",25000),
                new Employee("3", 37000));
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
