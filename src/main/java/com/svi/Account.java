package com.svi;

public class Account {
    private final Person person;
    private final Credentials credentials;
    private String type;

    public Account(Person person, Credentials credentials, String type) {
        this.person = person;
        this.credentials = credentials;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns this Account's first name
     *
     * @return the first name
     */
    public String getFirstName() {
        return person.getFirstName();
    }

    /**
     * Set this Account's first name to the given first name
     *
     * @param firstName the given first name
     */
    public void setFirstName(String firstName) {
        person.setFirstName(firstName);
    }

    /**
     * Returns this Account's first name
     *
     * @return the first name
     */
    public String getLastName() {
        return person.getLastName();
    }

    /**
     * Set this Account's last name to the given last name
     *
     * @param lastName the given last name
     */
    public void setLastName(String lastName) {
        person.setLastName(lastName);
    }

    /**
     * Returns this Account's username
     *
     * @return the username
     */
    public String getUsername() {
        return credentials.getUsername();
    }

    /**
     * Returns this Account's password
     *
     * @return the password
     */
    public String getPassword() {
        return credentials.getPassword();
    }

    /**
     * Set this Account's password to the given password
     *
     * @param password the given password
     */
    public void setPassword(String password) {
        credentials.setPassword(password);
    }
}
