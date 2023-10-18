package org.service.dto;

/**
 * Represents a request to purchase a cinema ticket.
 */
public class PurchaseRequest {

    private int row;
    private int column;

    /**
     * Default constructor for PurchaseRequest.
     */
    public PurchaseRequest() {
    }

    /**
     * Parameterized constructor for PurchaseRequest.
     *
     * @param row    The row number for the desired seat.
     * @param column The column number for the desired seat.
     */
    public PurchaseRequest(int row, int column) {
        this.row = row;
        this.column = column;
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
}
