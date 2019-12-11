package com.andrei.tddexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * MoneyTest
 */
public class MoneyTest {

    @DisplayName("Dollar.times(2) Test")
    @Test
    void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @DisplayName("Dollar.equals() Test")
    @Test
    void equalityTest() {
        assertEquals(Money.dollar(10), Money.dollar(10));
        assertNotEquals(Money.dollar(10), null);
        assertNotEquals(Money.dollar(10), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @DisplayName("Franc.times() Test")
    @Test
    void testFrancMultiplication() {
        Money franc = Money.franc(5);
        assertEquals(Money.franc(10), franc.times(2));
        assertEquals(Money.franc(15), franc.times(3));
    }

    @DisplayName("Franc.equals() Test")
    @Test
    void francEqualityTest() {
        assertEquals(Money.franc(10), Money.franc(10));
        assertNotEquals(Money.franc(10), null);
        assertNotEquals(Money.franc(10), Money.franc(5));
    }

    @DisplayName("Money.currency() Test")
    @Test
    void currencyTest() {
        // Visible becouse we are in the same package
        assertEquals("USD", Money.dollar(2).currency);
        assertEquals("CHF", Money.franc(2).currency);
    }
}