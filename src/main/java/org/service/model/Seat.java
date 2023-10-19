package org.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a seat in a cinema.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat {

    private int row;
    private int column;
    private int price;
    private boolean isBooked;
    private String token;

    /**
     * Parameterized constructor for Seat.
     *
     * @param row    The row number of the seat.
     * @param column The column number of the seat.
     * @param price  The price of the seat.
     */
    public Seat(int row, int column, int price) {
        this.row = row;
        this.column = column;
        this.price = price;
        this.isBooked = false;
        this.token = "";
    }

    @JsonIgnore
    public boolean isBooked() {
        return isBooked;
    }

    @JsonIgnore
    public String getToken() {
        return token;
    }

    /**
     * Get a string representation of the Seat object.
     *
     * @return A string representation of the Seat.
     */
    @Override
    public String toString() {
        return "Seat{" +
                "row=" + row +
                ", column=" + column +
                ", price=" + price +
                ", isBooked=" + isBooked +
                '}';
    }
}
