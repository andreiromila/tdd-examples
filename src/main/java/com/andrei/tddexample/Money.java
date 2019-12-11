package com.andrei.tddexample;

/**
 * Money
 */
public class Money {

    /**
     * Contains the amount the object holds
     */
    protected Integer amount;

    /**
     * Default constructor for the Money class
     * 
     * @param amount {@link Integer} The base amount
     */
    public Money(Integer amount) {
        this.amount = amount;
    }

    /**
     * The equals method implementation
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Money) {
            return this.amount == ((Money) obj).amount;
        }

        return false;
    }
}