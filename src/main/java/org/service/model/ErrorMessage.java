package org.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an error message with a description.
 */
public class ErrorMessage {

    @JsonProperty("error")
    String message;

    /**
     * Parameterized constructor for ErrorMessage.
     *
     * @param message The error message description.
     */
    public ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
