package org.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Represents a seat in a cinema.
 */
public class Seat {

    private int row;
    private int column;
    private int price;
    private boolean isBooked;
    private String token;

    /**
     * Default constructor for Seat.
     */
    public Seat() {
    }

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

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @JsonIgnore
    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @JsonIgnore
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
