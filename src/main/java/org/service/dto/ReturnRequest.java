package org.service.dto;

/**
 * Represents a request to return a purchased cinema ticket.
 */
public class ReturnRequest {

    private String token;

    /**
     * Default constructor for ReturnRequest.
     */
    public ReturnRequest() {
    }

    /**
     * Parameterized constructor for ReturnRequest.
     *
     * @param token The token representing the seat to be returned.
     */
    public ReturnRequest(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
