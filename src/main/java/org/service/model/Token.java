package org.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Utility class for generating random tokens.
 */
public class Token {

    String token;

    /**
     * Generates a random token as a UUID.
     *
     * @return A random token as a string.
     */
    public static String generate() {

        return UUID.randomUUID().toString();
    }
}
