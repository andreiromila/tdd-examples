package com.andrei.tddexample;

public class Dollar extends Money {

    /**
     * Default constructor for the Dollar class
     * 
     * @param amount {@link Integer} The base amount
     */
    public Dollar(Integer amount) {
        super(amount, "USD");
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
