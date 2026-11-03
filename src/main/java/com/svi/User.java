package com.svi;

/**
 * Represents a User account in the app.
 *
 * @author Harry Dominguez
 * @since 1.0
 */
public class User {
    private final String username;
    private String firstName;
    private String lastName;
    private String password;

    /**
     * Construct a User from the given credentials.
     *
     * @param firstName the given User first name
     * @param lastName  the given User last name
     * @param username  the given User username
     * @param password  the given User password
     */
    public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    /**
     * Returns this User's first name
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set this User's first name to the given first name
     *
     * @param firstName the given first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns this User's first name
     *
     * @return the first name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set this User's last name to the given last name
     *
     * @param lastName the given last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns this User's username
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns this User's password
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set this User's password to the given password
     *
     * @param password the given password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
