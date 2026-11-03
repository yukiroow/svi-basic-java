package com.svi;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String contact;

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

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
