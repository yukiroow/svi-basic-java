package com.svi;

/**
 * This class represents a User Account.
 *
 * @author Harry Dominguez
 * @since 2.0
 */
public class Account {
    private final Person person;
    private final Credentials credentials;
    private String type;

    /**
     * Construct an Account from the given Person object, Credentials object, and type String.
     *
     * @param person      the given Person object
     * @param credentials the given Credentials object
     * @param type        the given type String
     */
    public Account(Person person, Credentials credentials, String type) {
        this.person = person;
        this.credentials = credentials;
        this.type = type;
    }

    /**
     * Returns this Account's User type
     *
     * @return the User type
     */
    public String getType() {
        return type;
    }

    /**
     * Set this Account's User type to the given User type String
     *
     * @param type the given User type String
     */
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
     * Returns this Account's email address
     *
     * @return the email address
     */
    public String getEmail() {
        return person.getEmail();
    }

    /**
     * Set this Account's email address to the given email String
     *
     * @param email the given email String
     */
    public void setEmail(String email) {
        person.setEmail(email);
    }

    /**
     * Return this Account's contact number
     *
     * @return the contact number
     */
    public String getContact() {
        return person.getContact();
    }

    /**
     * Set this Account's contact number to the given contact number String
     *
     * @param contact the contact number String
     */
    public void setContact(String contact) {
        person.setContact(contact);
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
