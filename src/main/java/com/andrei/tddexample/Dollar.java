package com.andrei.tddexample;

public class Dollar {

    /**
     * Contains the amount the object holds
     */
    private int amount;

    /**
     * Default constructor for the Dollar class
     * 
     * @param amount {@link Integer} The base amount
     */
    public Dollar(int amount) {
        this.amount = amount;
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

    /**
     * The equals method implementation
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Dollar) {
            return this.amount == ((Dollar) obj).amount;
        }

        return false;
    }

}
