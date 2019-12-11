package com.andrei.tddexample;

/**
 * Franc
 */
public class Franc {

    /**
     * Contains the amount the object holds
     */
    private int amount;

    /**
     * Default constructor for the Franc class
     * 
     * @param amount {@link Integer} The base amount
     */
    public Franc(int amount) {
        this.amount = amount;
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

    /**
     * The equals method implementation
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Franc) {
            return this.amount == ((Franc) obj).amount;
        }

        return false;
    }

}