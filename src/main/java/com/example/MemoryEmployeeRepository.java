package com.example;

import java.util.ArrayList;
import java.util.List;

public class MemoryEmployeeRepository implements EmployeeRepository{

    List <Employee> employees = new ArrayList<>();

    public MemoryEmployeeRepository() {
    }

    public MemoryEmployeeRepository(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    @Override
    public List<Employee> findAll() {

        return (employees);
    }

    @Override
    public Employee save(Employee e) {
        employees.add(e);
        return e;
    }
}