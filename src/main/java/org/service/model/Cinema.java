package org.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents a cinema with rows and seats.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cinema {

    private int rows;
    private int columns;
    private List<Seat> seats;
}
