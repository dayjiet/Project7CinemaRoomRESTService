package org.service.model;

/**
 * Utility class for providing a secret password.
 */
public class Password {


    static final String password = "super_secret";

    /**
     * Retrieves the secret password.
     *
     * @return The secret password as a string.
     */
    public static String get() {
        return password;
    }
}
