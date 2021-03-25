package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeManagerTest {

    @Test
    void numberOfEmployeesPaid(){
    EmployeeRepository employeeRepository = new TestEmployeeRepository();
    BankService bankService = new TestBankService();
        EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);

        assertEquals(2, employeeManager.payEmployees());
    }


}