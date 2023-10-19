package org.service.service;

import org.service.dto.PurchaseResponse;
import org.service.dto.ReturnResponse;
import org.service.model.Cinema;

public interface CinemaServiceInterface {

    Cinema getCinema();
    PurchaseResponse getPurchasedSeat(int row, int column);
    ReturnResponse getReturnedSeat(String token);
}
