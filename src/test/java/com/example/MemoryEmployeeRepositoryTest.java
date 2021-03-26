package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MemoryEmployeeRepositoryTest {

    @Test
    void saveToList() {

        MemoryEmployeeRepository memoryEmployeeRepository = new MemoryEmployeeRepository();

        var actual = memoryEmployeeRepository.save(new Employee("1", 20000));
        assertThat(memoryEmployeeRepository.findAll()).contains(actual);

    }

    @Test
    void addNewToList(){

        List<Employee> employees = List.of(new Employee("1",25000),
                new Employee("2", 37000), new Employee("3",24000));

        MemoryEmployeeRepository memoryEmployeeRepository = new MemoryEmployeeRepository(employees);

        memoryEmployeeRepository.save(new Employee("4",30000));

        assertEquals(4,memoryEmployeeRepository.findAll().size());

    }

}