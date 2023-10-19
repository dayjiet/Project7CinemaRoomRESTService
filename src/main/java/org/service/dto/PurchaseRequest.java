package org.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a request to purchase a cinema ticket.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseRequest {

    private int row;
    private int column;
}
