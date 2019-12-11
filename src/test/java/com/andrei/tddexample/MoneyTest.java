package com.andrei.tddexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * MoneyTest
 */
public class MoneyTest {

    @DisplayName("Money.times(2) Test")
    @Test
    void testMultiplication() {
        Money dollar = Money.dollar(5);
        assertEquals(Money.dollar(10), dollar.times(2));
        assertEquals(Money.dollar(15), dollar.times(3));

        Money franc = Money.franc(5);
        assertEquals(Money.franc(20), franc.times(4));
        assertEquals(Money.franc(35), franc.times(7));
    }

    @DisplayName("Dollar.equals() Test")
    @Test
    void equalityTest() {
        assertEquals(Money.dollar(10), Money.dollar(10));
        assertNotEquals(Money.dollar(10), null);
        assertNotEquals(Money.dollar(10), Money.dollar(5));

        assertNotEquals(Money.dollar(5), Money.franc(5));

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