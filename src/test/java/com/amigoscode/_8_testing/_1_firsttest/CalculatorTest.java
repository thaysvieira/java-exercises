package com.amigoscode._8_testing._1_firsttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Exercise: Your First Unit Tests
 *
 * In this exercise you will write your first JUnit 5 tests for the Calculator class.
 * Complete each TODO to practice basic assertions and test lifecycle annotations.
 */
class CalculatorTest {

    // TODO: 1 - Declare a Calculator field and use @BeforeEach to create a fresh
    //  Calculator instance before each test. This ensures tests are independent.
    //  Hint: Write a setUp() method annotated with @BeforeEach that assigns
    //  a new Calculator() to your field.
    private  Calculator underTest;
    @BeforeEach
    void setUp() {
        underTest = new Calculator();
    }

    // TODO: 2 - Write a test for the add method using assertEquals.
    //  Annotate it with @Test and @DisplayName("2 + 3 should equal 5").
    //  Call calculator.add(2, 3) and assert the result equals 5.
    @Test
    @DisplayName("2 + 3 should equal 5")
    void add(){
       //given
       int a = 2;
       int b = 3;
       int expected = 5;
       //when
        int actual = underTest.add(a, b);
        //then
        Assertions.assertEquals(expected,actual);
    }

    // TODO: 3 - Write a test for the subtract method.
    //  Annotate with @Test and @DisplayName.
    //  Test that calculator.subtract(10, 4) equals 6.
    @Test
    @DisplayName("Test that calculator.subtract(10, 4) equals 6")
    void subtract(){
        //given
        int a = 10;
        int b = 4;
        int expected = 6;
        //when
        int actual = underTest.subtract(a, b);
        //then
        Assertions.assertEquals(expected,actual);
    }

    // TODO: 4 - Write a test for the multiply method.
    //  Annotate with @Test and @DisplayName.
    //  Test that calculator.multiply(3, 7) equals 21.
    @Test
    @DisplayName("Test that calculator.multiply(3, 7) equals 21")
    void multiply(){
        //given
        int a = 3;
        int b = 7;
        int expected = 21;
        //when
        int actual = underTest.multiply(a, b);
        //then
        Assertions.assertEquals(expected,actual);
    }


    // TODO: 5 - Write a test that verifies dividing by zero throws ArithmeticException.
    //  Use assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0)).
    //  Add a @DisplayName annotation.
    @Test
    @DisplayName("test that verifies dividing by zero throws ArithmeticException")
    void dividingByZeroShouldThrowArithmeticException(){
        //given
        int a = 10;
        int b = 0;
        ArithmeticException exception =
                assertThrows(ArithmeticException.class, () -> {
                  underTest.divide(a,b);
                });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    // TODO: 6 - Write a test using assertNotEquals.
    //  Verify that calculator.add(2, 2) is NOT equal to 5.
    //  Add a @DisplayName annotation.
    @Test
    @DisplayName("Test that alculator.add(2, 2) is NOT equal to 5")
    void givenResultNotEqual(){
        //given
        int a = 2;
        int b = 2;
        int notExpected = 5;
        //when
        int actual = underTest.multiply(a, b);
        //then
        Assertions.assertNotEquals(notExpected,actual);
    }

    // TODO: 7 - Add @DisplayName annotations to ALL of your tests above (if not done already).
    //  Make the display names descriptive, e.g., "Adding 2 and 3 should return 5".
    //  Then write one more test: verify that calculator.divide(10, 2) equals 5.
    @Test
    @DisplayName("Dividing 10 to 2 should return 5")
    void givenResultEqualForDivide(){
        //given
        int a = 10;
        int b = 2;
        int expected = 5;
        //when
        int actual = underTest.divide(a, b);
        //then
        Assertions.assertEquals(expected,actual);
    }
}
