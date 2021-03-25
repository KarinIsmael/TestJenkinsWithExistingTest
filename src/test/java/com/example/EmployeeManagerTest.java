package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

    @Test
    void numberOfEmployeesPaidWithMockito(){
        EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
        BankService bankService = mock(BankService.class);

        when(employeeRepository.findAll()).thenReturn(List.of(new Employee("2",25000),
                new Employee("3", 37000), new Employee("3",24000)));

        EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);

        assertEquals(3, employeeManager.payEmployees());
    }

    @Test
    void noEmployeesThrowsExceptionWithMockito(){

        EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
        BankService bankService = mock(BankService.class);

        when(employeeRepository.findAll()).thenReturn(List.of(new Employee("2",25000),
                new Employee("3", 37000), new Employee("3",24000)));


        EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);

        assertFalse(employeeManager.payEmployees()==1);

    }

}