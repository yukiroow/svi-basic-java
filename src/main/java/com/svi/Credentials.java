package com.svi;

public class Credentials {
    private final String username;
    private String password;

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
