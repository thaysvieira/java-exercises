package com.amigoscode._8_testing._8_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Exercise: Test-Driven Development (TDD) - Shipping Cost Calculator
 *
 * In this exercise you practice TDD by writing tests FIRST, then implementing
 * the ShippingCostCalculator to make the tests pass.
 *
 * Shipping rules:
 * - Domestic: $5.00 base + $0.50 per kg
 * - International: $15.00 base + $1.50 per kg
 * - Weight of 0 kg = free shipping ($0.00)
 * - Negative weight -> IllegalArgumentException
 * - Null destination -> IllegalArgumentException
 * - Heavy package surcharge: weight > 50 kg adds $25.00 extra
 */
@DisplayName("TDD: Shipping Cost Calculator Tests")
class ShippingCostCalculatorTest {

    private ShippingCostCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ShippingCostCalculator();
    }

    // TODO: 1 - Test domestic shipping cost calculation.
    //  A 10 kg domestic package should cost: $5.00 + (10 * $0.50) = $10.00.
    //  Assert that calculate(10, "domestic") equals 10.0.
    //  Also test: 1 kg domestic = $5.50.
    //  Then implement the domestic calculation in ShippingCostCalculator.
    @Test
    void testCalculatorDomestic(){
        double actual =calculator.calculate(10,"domestic");
        assertEquals(10.0,actual);
    }


    // TODO: 2 - Test international shipping cost calculation.
    //  A 10 kg international package should cost: $15.00 + (10 * $1.50) = $30.00.
    //  Assert that calculate(10, "international") equals 30.0.
    //  Also test: 1 kg international = $16.50.
    //  Then implement the international calculation.
    @Test
    void testCalculatorInternational(){
        double actual =calculator.calculate(10,"international");
        double actualTest2 =calculator.calculate(1,"international");
        assertEquals(30.0,actual);
        assertEquals(16.50,actualTest2);
    }

    // TODO: 3 - Test that negative weight throws IllegalArgumentException.
    //  Use assertThrows(IllegalArgumentException.class,
    //      () -> calculator.calculate(-1, "domestic"));
    //  Then implement the validation in ShippingCostCalculator.
    @Test
    void testCalculatorNegativeWeight(){
        assertThrows(IllegalArgumentException.class,
                     () -> calculator.calculate(-1, "domestic"));
    }

    // TODO: 4 - Test that null destination throws IllegalArgumentException.
    //  Use assertThrows(IllegalArgumentException.class,
    //      () -> calculator.calculate(5, null));
    //  Then implement the null check.
    @Test
    void testCalculatorNullDestination(){
        assertThrows(IllegalArgumentException.class,
                     () -> calculator.calculate(5, null));
    }

    // TODO: 5 - Test that weight of 0 kg results in free shipping.
    //  Assert that calculate(0, "domestic") equals 0.0.
    //  Assert that calculate(0, "international") equals 0.0.
    //  Then implement the free shipping rule.
    @Test
    void testCalculatorWeightZero(){
        double actual =calculator.calculate(0.0,"domestic");
        double international =calculator.calculate(0.0,"international");
        assertEquals(0.0,actual);
        assertEquals(0.0,international);
    }

    // TODO: 6 - Test heavy package surcharge for weight > 50 kg.
    //  A 60 kg domestic package: $5.00 + (60 * $0.50) + $25.00 = $60.00.
    //  A 60 kg international package: $15.00 + (60 * $1.50) + $25.00 = $130.00.
    //  Assert both calculations.
    //  Then implement the heavy package surcharge.
    @Test
    void testCalculatorHeavyWeight(){
        double actual =calculator.calculate(60.0,"domestic");
        double international =calculator.calculate(60.0,"international");
        assertEquals(60.0,actual);
        assertEquals(130.0,international);
    }
}
