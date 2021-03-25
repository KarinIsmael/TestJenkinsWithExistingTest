package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    void add(){ assertEquals(12,calc.add("2/n4,5/n1")); }

    @Test
    void handleDifferentDelimiters(){
    assertEquals(3,calc.add("//;/n1;2"));
    }

    @Test
    void catchExceptionForNegativeNumbers(){
        var exception = assertThrows(RuntimeException.class,() ->calc.add("-2") );
           assertEquals("-2 negatives not allowed",exception.getMessage() );
    }

    @Test
    void ignoreLargerThan1000(){
        assertEquals(7,calc.add("2,1001;5"));
    }

    @Test
    void delimitersOfAnyLength(){
        assertEquals(6,calc.add("//***/n1***2***3"));
    }

}