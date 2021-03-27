package com.example;

import org.junit.jupiter.api.Test;

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


        MemoryEmployeeRepository memoryEmployeeRepository = new MemoryEmployeeRepository();

        memoryEmployeeRepository.save(new Employee("4",30000));

        assertEquals(4,memoryEmployeeRepository.findAll().size());

    }

    @Test
    void addNewWithSameIdReplacesExistingEmployee(){

        MemoryEmployeeRepository memoryEmployeeRepository = new MemoryEmployeeRepository();

        var b = memoryEmployeeRepository.save(new Employee ("2",5000));

        assertEquals(5000, b.getSalary());
    }

}