package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {

    @Test
    void numberOfEmployeesPaid(){
    EmployeeRepository employeeRepository = new TestEmployeeRepository();
    BankService bankService = new TestBankService();
        EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);

        assertEquals(3, employeeManager.payEmployees());
    }

    @Test
    void noEmployeesThrowsException(){

        EmployeeRepository employeeRepository = new TestEmployeeRepository();
        BankService bankService = new TestBankService();
        EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);

        assertFalse(employeeManager.payEmployees()==2);

    }

}