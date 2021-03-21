package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
static Calculator calc = new Calculator();

    @Test
    void emptyReturnsZero(){
        assertEquals(0, calc.add(""));
    }

    @Test
    void singleNumberReturnsItself(){
    assertEquals(2, calc.add("2"));
    }

    @Test
    void sumOfTwoNumbers(){
    assertEquals(3, calc.add("1,2"));
    }

    @Test
    void add(){
        assertEquals(12,calc.add("2,4,5,1"));

    }


}