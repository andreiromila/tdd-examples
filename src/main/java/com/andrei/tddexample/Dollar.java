package com.andrei.tddexample;

public class Dollar extends Money {

    /**
     * Default constructor for the Dollar class
     * 
     * @param amount {@link Integer} The base amount
     */
    public Dollar(Integer amount) {
        super(amount);
    }

    /**
     * Multiplies the current amount by the indicated multiplier and returns a new
     * Dollar instance.
     * 
     * @param multiplier {@link Integer} The multiplier that we'll multiply by
     * @return {@link Dollar} A new instance of the object
     */
    public Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }
}
