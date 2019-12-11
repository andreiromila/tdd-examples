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
     * The currency of the current object
     */
    protected String currency;

    /**
     * Returns a new Money instance
     * 
     * @return {@link Money} A new Money instance
     */
    public static Money dollar(Integer amount) {
        return new Money(amount, "USD");
    }

    /**
     * Returns a new Money instance
     * 
     * @return {@link Money} A new Money instance
     */
    public static Money franc(Integer amount) {
        return new Money(amount, "CHF");
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
    public Money times(int multiplier) {
        return new Money(amount * multiplier, this.currency);
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
            Money money = (Money) obj;

            // We must have the same currency too
            return this.amount == money.amount && this.currency == money.currency;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Money [amount=" + amount + ", currency=" + currency + "]";
    }

}