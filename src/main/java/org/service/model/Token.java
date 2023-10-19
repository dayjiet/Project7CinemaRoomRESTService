package org.service.model;

import java.util.UUID;

/**
 * Utility class for generating random tokens.
 */
public class Token {

    /**
     * Generates a random token as a UUID.
     *
     * @return A random token as a string.
     */
    public static String generate() {

        return UUID.randomUUID().toString();
    }
}
