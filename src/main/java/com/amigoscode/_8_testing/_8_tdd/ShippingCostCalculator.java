package com.amigoscode._8_testing._8_tdd;

/**
 * TDD Exercise: Shipping Cost Calculator
 * <p>
 * This class is intentionally EMPTY. Students should:
 * 1. First write tests in ShippingCostCalculatorTest.java (test-first approach)
 * 2. Then implement this class to make the tests pass
 * <p>
 * Shipping rules to implement:
 * - Domestic shipping: $5.00 base + $0.50 per kg
 * - International shipping: $15.00 base + $1.50 per kg
 * - Weight of 0 kg = free shipping ($0.00)
 * - Negative weight should throw IllegalArgumentException
 * - Null destination should throw IllegalArgumentException
 * - Heavy package surcharge: weight > 50 kg adds $25.00 extra
 */
public class ShippingCostCalculator {

    /**
     * Calculates the shipping cost based on weight and destination.
     *
     * @param weight      the weight of the package in kilograms
     * @param destination "domestic" or "international"
     * @return the total shipping cost
     * @throws IllegalArgumentException if weight is negative or destination is null
     */
    public double calculate(double weight, String destination) {
        // TODO: Students implement this after writing tests first (TDD approach)
        //  A 10 kg international package should cost: $15.00 + (10 * $1.50) = $30.00.
        //  Assert that calculate(10, "international") equals 30.0.
        if (weight < 0 || destination == null) {
            throw new IllegalArgumentException();
        }
        return switch (destination) {
            case "domestic" -> {
                if (weight == 0.0) {
                    yield 0.0;
                }else if(weight>50){
                    yield 5.00 + (weight * 0.50)+25.0;
                }
                yield 5.00 + (weight * 0.50);
            }
            case "international" -> {
                if (weight == 0.0) {
                    yield 0.0;
                }else if(weight>50){
                    yield 15.00 + (weight * 1.50)+25.0;
                }
                yield 15.00 + (weight * 1.50);
            }
            default -> throw new UnsupportedOperationException("Implement me using TDD!");
        };
    }
}
