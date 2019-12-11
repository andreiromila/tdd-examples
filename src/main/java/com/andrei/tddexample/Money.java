package com.andrei.tddexample;

/**
 * Money
 */
public abstract class Money {

    /**
     * Contains the amount the object holds
     */
    protected Integer amount;

    /**
     * The currency of the current object
     */
    protected String currency;

    /**
     * Returns a new Dollar instance
     * 
     * @return {@link Dollar} A new Dollar instance
     */
    public static Money dollar(Integer amount) {
        return new Dollar(amount);
    }

    /**
     * Returns a new Franc instance
     * 
     * @return {@link Franc} A new Franc instance
     */
    public static Money franc(Integer amount) {
        return new Franc(amount);
    }

    /**
     * Default constructor for the Money class
     * 
     * @param amount {@link Integer} The base amount
     */
    public Money(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * Multiplies the current amount by the indicated multiplier and returns a new
     * Money instance.
     * 
     * @param multiplier {@link Integer} The multiplier that we'll multiply by
     * @return {@link Money} A new instance of the object
     */
    public abstract Money times(int multiplier);

    /**
     * The equals method implementation
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Money) {
            Money money = (Money) obj;

            // We must have the same currency too
            return this.amount == money.amount && this.currency == money.currency;
        }

        return false;
    }
}