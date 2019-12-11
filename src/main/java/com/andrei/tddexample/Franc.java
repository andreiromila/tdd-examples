package com.andrei.tddexample;

/**
 * Franc
 */
public class Franc extends Money {

    /**
     * Default constructor for the Franc class
     * 
     * @param amount {@link Integer} The base amount
     */
    public Franc(Integer amount) {
        super(amount, "CHF");
    }

    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}