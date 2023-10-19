package org.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a request to return a purchased cinema ticket.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturnRequest {

    private String token;
}
