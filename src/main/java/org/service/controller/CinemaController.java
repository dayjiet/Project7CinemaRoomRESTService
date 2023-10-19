package org.service.controller;

import lombok.AllArgsConstructor;
import org.service.dto.PurchaseRequest;
import org.service.dto.ReturnRequest;
import org.service.model.ErrorMessage;
import org.service.model.Cinema;
import org.service.model.Password;
import org.service.service.CinemaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * Controller class for managing cinema-related HTTP endpoints.
 */
@AllArgsConstructor
@RestController
public class CinemaController {

    private final CinemaService cinemaService;

    /**
     * Retrieves information about the available seats in the cinema.
     *
     * @return A Cinema object containing seat information.
     */
    @GetMapping("/seats")
    public Cinema getSeats() {
        return this.cinemaService.getCinema();
    }

    @PostMapping("/purchase")
    public ResponseEntity<?> purchaseTicket(@RequestBody PurchaseRequest request) {

        try {
            var response = this.cinemaService.getPurchasedSeat(request.getRow(), request.getColumn());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Error error) {
            var errorBody = new ErrorMessage(error.getMessage());
            return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/return")
    public ResponseEntity<?> returnTicket(@RequestBody ReturnRequest request) {

        try {
            var response = this.cinemaService.getReturnedSeat(request.getToken());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Error error) {
            var errorBody = new ErrorMessage(error.getMessage());
            return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Retrieves statistics about cinema revenue, available seats, and purchased seats.
     *
     * @param password The password required to access the statistics.
     * @return The Statistics object containing revenue and seat statistics.
     */
    @GetMapping("/stats")
    public ResponseEntity<?> getStatistics(@RequestParam(required = false) String password) {

        if (Objects.equals(password, Password.get())) {
            var statistics = this.cinemaService.statistics;
            return new ResponseEntity<>(statistics, HttpStatus.OK);
        } else {
            var errorBody = new ErrorMessage("The password is wrong!");
            return new ResponseEntity<>(errorBody, HttpStatus.UNAUTHORIZED);
        }
    }
}
