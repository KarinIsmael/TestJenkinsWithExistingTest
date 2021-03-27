package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IT {

    @Test
    void repoIntegrationTest() {

        MemoryEmployeeRepository employeeRepository = new MemoryEmployeeRepository();
        var actual = employeeRepository.save(new Employee("1", 20000));

        assertEquals(23000, actual.getSalary());

    }
}