package com.andrei.tddexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * MoneyTest
 */
public class MoneyTest {

    @DisplayName("Dollar.times(2) test.")
    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);

        // Multiply by 2
        Dollar product = five.times(2);

        // Assert that we have 10 dollars
        assertEquals(new Dollar(10), product);

        // Assert for 15
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @DisplayName("Dollar.equals() test.")
    @Test
    void equalityTest() {
        assertEquals(new Dollar(10), new Dollar(10));
        assertNotEquals(new Dollar(10), null);
        assertNotEquals(new Dollar(10), new Dollar(5));
    }

    @DisplayName("Franc.times() Test")
    @Test
    void testFrancMultiplication() {
        Franc franc = new Franc(5);

        // Multiply by 2
        Franc product = franc.times(2);

        // Assert that we have 10 francs
        assertEquals(new Franc(10), product);

        // Assert for 15
        product = franc.times(3);
        assertEquals(new Franc(15), product);
    }

    @DisplayName("Franc.equals() test.")
    @Test
    void francEqualityTest() {
        assertEquals(new Franc(10), new Franc(10));
        assertNotEquals(new Franc(10), null);
        assertNotEquals(new Franc(10), new Franc(5));
    }
}