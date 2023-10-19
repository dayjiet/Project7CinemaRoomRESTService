package org.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an error message with a description.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

    @JsonProperty("error")
    String message;
}
