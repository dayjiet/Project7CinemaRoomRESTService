package org.service.service;

import org.service.dto.PurchaseResponse;
import org.service.dto.ReturnResponse;
import org.service.model.Cinema;
import org.service.model.Seat;
import org.service.model.Statistics;
import org.service.model.Token;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Service class that manages cinema-related operations.
 */
@Service
public class CinemaService {

    private final List<Seat> seats;
    public final Statistics statistics;
    private static final int MIDDLE_ROW = 4;
    private static final int HIGH_PRICE = 10;
    private static final int LOW_PRICE = 8;
    private static final int STARTS_FROM = 1;
    private static final int TOTAL_ROWS = 9;
    private static final int TOTAL_COLUMNS = 9;

    /**
     * Default constructor for CinemaService.
     */
    public CinemaService() {
        this.seats = getSeats();
        this.statistics = getStatistics();
    }

    /**
     * Generates and returns a list of seats for the cinema.
     *
     * @return A list of Seat objects.
     */
    private List<Seat> getSeats() {

        List<Seat> seats = new ArrayList<>();

        for (int row = STARTS_FROM; row <= TOTAL_ROWS; row++) {
            for (int column = STARTS_FROM; column <= TOTAL_COLUMNS; column++) {
                int price = row <= MIDDLE_ROW ? HIGH_PRICE : LOW_PRICE;
                Seat seat = new Seat(row, column, price);
                seats.add(seat);
            }
        }

        return seats;
    }

    /**
     * Generates and returns the initial statistics for the cinema.
     *
     * @return A Statistics object with initial values.
     */
    private Statistics getStatistics() {
        int currentIncome = 0;
        int availableSeats = TOTAL_ROWS * TOTAL_COLUMNS;
        int purchasedSeats = 0;

        return new Statistics(currentIncome, availableSeats, purchasedSeats);
    }

    /**
     * Retrieves the cinema configuration, including rows, columns, and seats.
     *
     * @return A Cinema object representing the cinema configuration.
     */
    public Cinema getCinema() {

        Cinema cinema = new Cinema();
        cinema.setRows(TOTAL_ROWS);
        cinema.setColumns(TOTAL_COLUMNS);
        cinema.setSeats(getSeats());

        return cinema;
    }

    public PurchaseResponse getPurchasedSeat(int row, int column) {

        var token = Token.generate();
        var seat = this.getSeat(row, column);
        seat.setBooked(true);
        seat.setToken(token);

        this.statistics.setCurrentIncome(this.statistics.getCurrentIncome() + seat.getPrice());
        this.statistics.setAvailableSeats(this.statistics.getAvailableSeats() - 1);
        this.statistics.setPurchasedSeats(this.statistics.getPurchasedSeats() + 1);

        var purchasedSeat = new Seat(seat.getRow(), seat.getColumn(), seat.getPrice());
        return new PurchaseResponse(token, purchasedSeat);
    }

    /**
     * Retrieves a specific seat based on row and column numbers.
     *
     * @param row    The row number of the seat.
     * @param column The column number of the seat.
     * @return The Seat object for the specified row and column.
     * @throws RuntimeException If the seat has already been booked.
     * @throws RuntimeException If the row or column is out of bounds.
     */
    public Seat getSeat(int row, int column) {

        for (Seat seat : seats) {
            if (seat.getRow() == row && seat.getColumn() == column) {
                if (seat.isBooked()) {
                    throw new Error("The ticket has been already purchased!");
                }

                return seat;
            }
        }
        throw new Error("The number of a row or a column is out of bounds!");
    }

    public ReturnResponse getReturnedSeat(String token) {
        var seat = getSeat(token);
        seat.setBooked(false);
        seat.setToken("");

        this.statistics.setCurrentIncome(this.statistics.getCurrentIncome() - seat.getPrice());
        this.statistics.setAvailableSeats(this.statistics.getAvailableSeats() + 1);
        this.statistics.setPurchasedSeats(this.statistics.getPurchasedSeats() - 1);

        var returnedSeat = new Seat(seat.getRow(), seat.getColumn(), seat.getPrice());
        return new ReturnResponse(returnedSeat);
    }

    public Seat getSeat(String token) {
        for (Seat seat : seats) {
            if (Objects.equals(seat.getToken(), token)) {
                return seat;
            }
        }
        throw new Error("Wrong token!");
    }
}
