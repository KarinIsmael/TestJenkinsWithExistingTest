package com.example;

import java.util.ArrayList;
import java.util.List;

public class MemoryEmployeeRepository implements EmployeeRepository{

    public static List <Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("1",23000));
        employees.add(new Employee("2",45000));
        employees.add(new Employee("3",24000));
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