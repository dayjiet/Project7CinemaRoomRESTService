package org.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.service.model.Seat;

/**
 * Represents a response to a ticket purchase request.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseResponse {

    String token;
    @JsonProperty("ticket")
    Seat seat;
}
