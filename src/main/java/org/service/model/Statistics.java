package org.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents statistics related to cinema revenue and seat occupancy.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Statistics {

    @JsonProperty("income")
    int currentIncome;
    @JsonProperty("available")
    int availableSeats;
    @JsonProperty("purchased")
    int purchasedSeats;
}
