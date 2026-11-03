package com.svi;

/**
 * This class represents a User Account's personal information.
 *
 * @author Harry Dominguez
 * @since 2.0
 */
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String contact;

    /**
     * Construct a Person from the given personal information Strings.
     *
     * @param firstName the given first name
     * @param lastName  the given last name
     * @param email     the given email address
     * @param contact   the given contact number
     */
    public Person(String firstName, String lastName, String email, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
    }

    /**
     * Returns this Person's first name
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set this Person's first name to the given first name
     *
     * @param firstName the given first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns this Person's first name
     *
     * @return the first name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set this Person's last name to the given last name
     *
     * @param lastName the given last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Return this Person's contact number
     *
     * @return the contact number
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set this Person's contact number to the given contact number String
     *
     * @param email the contact number String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Return this Person's contact number
     *
     * @return the contact number
     */
    public String getContact() {
        return contact;
    }

    /**
     * Set this Person's contact number to the given contact number String
     *
     * @param contact the contact number String
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
}
