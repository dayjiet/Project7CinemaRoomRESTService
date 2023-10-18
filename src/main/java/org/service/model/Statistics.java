package org.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents statistics related to cinema revenue and seat occupancy.
 */
public class Statistics {

    @JsonProperty("income")
    int currentIncome;
    @JsonProperty("available")
    int availableSeats;
    @JsonProperty("purchased")
    int purchasedSeats;

    /**
     * Default constructor for Statistics.
     */
    public Statistics() {
    }

    /**
     * Parameterized constructor for Statistics.
     *
     * @param currentIncome    The current total income of the cinema.
     * @param availableSeats   The number of available seats in the cinema.
     * @param purchasedSeats   The number of seats that have been purchased.
     */
    public Statistics(int currentIncome, int availableSeats, int purchasedSeats) {
        this.currentIncome = currentIncome;
        this.availableSeats = availableSeats;
        this.purchasedSeats = purchasedSeats;
    }

    public int getCurrentIncome() {
        return currentIncome;
    }

    public void setCurrentIncome(int currentIncome) {
        this.currentIncome = currentIncome;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getPurchasedSeats() {
        return purchasedSeats;
    }

    public void setPurchasedSeats(int purchasedSeats) {
        this.purchasedSeats = purchasedSeats;
    }
}
