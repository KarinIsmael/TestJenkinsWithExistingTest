package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemoryEmployeeRepositoryTest {

    @Test
    void saveToList() {

        MemoryEmployeeRepository memoryEmployeeRepository = new MemoryEmployeeRepository();

        var actual = memoryEmployeeRepository.save(new Employee("1", 20000));
        assertThat(memoryEmployeeRepository.findAll()).contains(actual);

    }
}