package com.svi;

/**
 * This class represents a User Account's Credential pair.
 *
 * @author Harry Dominguez
 * @since 2.0
 */
public class Credentials {
    private final String username;
    private String password;

    /**
     * Construct a Credential from the given username and password.
     *
     * @param username the given username String
     * @param password the given password String
     */
    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Returns this username of this Credential
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns the password of this Credential
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password of this Credential to the given password
     *
     * @param password the given password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
