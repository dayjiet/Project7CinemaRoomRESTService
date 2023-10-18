package org.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.service.model.Seat;

/**
 * Represents a response to a ticket purchase request.
 */
public class PurchaseResponse {

    String token;
    @JsonProperty("ticket")
    Seat seat;

    /**
     * Default constructor for PurchaseResponse.
     */
    public PurchaseResponse() {
    }

    /**
     * Parameterized constructor for PurchaseResponse.
     *
     * @param token The token representing the purchased seat.
     * @param seat  The seat that was purchased.
     */
    public PurchaseResponse(String token, Seat seat) {
        this.token = token;
        this.seat = seat;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
