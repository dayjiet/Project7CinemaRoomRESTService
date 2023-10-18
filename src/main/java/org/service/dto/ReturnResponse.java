package org.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.service.model.Seat;

/**
 * Represents a response to a ticket return request.
 */
public class ReturnResponse {

    @JsonProperty("ticket")
    Seat seat;

    /**
     * Default constructor for ReturnResponse.
     */
    public ReturnResponse() {
    }

    /**
     * Parameterized constructor for ReturnResponse.
     *
     * @param seat The seat that was returned.
     */
    public ReturnResponse(Seat seat) {
        this.seat = seat;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
