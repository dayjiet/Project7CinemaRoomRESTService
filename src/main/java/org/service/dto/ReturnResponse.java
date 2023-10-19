package org.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.service.model.Seat;

/**
 * Represents a response to a ticket return request.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturnResponse {

    @JsonProperty("ticket")
    Seat seat;
}
