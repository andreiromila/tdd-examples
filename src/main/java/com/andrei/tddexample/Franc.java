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
        super(amount);
    }

    /**
     * Multiplies the current amount by the indicated multiplier and returns a new
     * Franc instance.
     * 
     * @param multiplier {@link Integer} The multiplier that we'll multiply by
     * @return {@link Franc} A new instance of the object
     */
    public Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

}