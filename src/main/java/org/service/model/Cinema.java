package org.service.model;

import java.util.List;

/**
 * Represents a cinema with rows and seats.
 */
public class Cinema {

    private int rows;
    private int columns;
    private List<Seat> seats;

    /**
     * Default constructor for Cinema.
     */
    public Cinema() {
    }

    /**
     * Parameterized constructor for Cinema.
     *
     * @param rows    The number of rows in the cinema.
     * @param columns The number of columns in the cinema.
     * @param seats   The list of seats in the cinema.
     */
    public Cinema(int rows, int columns, List<Seat> seats) {
        this.rows = rows;
        this.columns = columns;
        this.seats = seats;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
