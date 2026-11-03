package com.svi;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * This Class contains the main entry point of this application.
 *
 * @author Harry Dominguez
 * @since 1.0
 */
public class Main {

    /**
     * This is the main entry point of this application.
     *
     * <p>
     * This contains the main loop of the application for the menu option selection.
     * </p>
     */
    static void main() {
        Account user = null;
        Scanner keyboardInput = new Scanner(System.in);
        while (true) {
            printMenu();
            int menuOption = readMenuOption(keyboardInput);
            switch (menuOption) {
                case 1 -> user = createUserAccount(keyboardInput);
                case 2 -> {
                    if (user == null) {
                        System.out.println("Please create a User Account first!");
                        continue;
                    }
                    updateUserAccount(keyboardInput, user);
                }
                case 3 -> {
                    if (user == null) {
                        System.out.println("Please create a User Account first!");
                        continue;
                    }
                    printUserDetails(user);
                }
                case 4 -> {
                    System.out.println("Bye bye!");
                    System.exit(0);
                }
            }
        }
    }

    /**
     * This prompts and captures the required fields for creating a User object.
     *
     * @param keyboardInput the Scanner object for user input
     * @return the User with the given fields
     */
    static Account createUserAccount(Scanner keyboardInput) {
        String tempFirstName, tempLastName, tempUsername, tempEmail, tempContact, tempPassword, tempType;
        System.out.println("---------------------------------------");
        System.out.printf("%-20s", "Enter First Name:");
        tempFirstName = readStringInput(keyboardInput);
        System.out.printf("%-20s", "Enter Last Name:");
        tempLastName = readStringInput(keyboardInput);
        System.out.printf("%-20s", "Enter Username:");
        tempUsername = readStringInput(keyboardInput);
        tempEmail = readEmail(keyboardInput);
        tempContact = readContact(keyboardInput);
        tempType = readUserType(keyboardInput);
        System.out.printf("%-20s", "Enter Password:");
        tempPassword = readStringInput(keyboardInput);
        System.out.println("USER CREATED!");
        return new Account(new Person(tempFirstName, tempLastName, tempEmail, tempContact), new Credentials(tempUsername, tempPassword), tempType);
    }

    /**
     * This prompts and captures an email String from user input.
     *
     * <p>
     * Includes regex validation for email format.
     * </p>
     *
     * @param keyboardInput the Scanner object for user input
     * @return the email String
     */
    static String readEmail(Scanner keyboardInput) {
        Pattern emailRegex = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
        while (true) {
            System.out.printf("%-20s", "Enter Email:");
            String email = readStringInput(keyboardInput);
            if (email.trim().isBlank()) {
                System.out.println("Enter a valid email!");
                continue;
            }
            if (!emailRegex.matcher(email).matches()) {
                System.out.println("Enter a valid email!");
                continue;
            }
            return email;
        }
    }

    /**
     * This prompts and captures a contact number String from user input.
     *
     * <p>
     * Includes regex validation for PH contact number format (09).
     * </p>
     *
     * @param keyboardInput the Scanner object for user input
     * @return the contact number String
     */
    static String readContact(Scanner keyboardInput) {
        Pattern numRegex = Pattern.compile("^09\\d{9}$");
        while (true) {
            System.out.printf("%-20s", "Enter Contact No:");
            String num = readStringInput(keyboardInput);
            if (num.trim().isBlank()) {
                System.out.println("Enter a valid contact number (Ex. 09123456789)!");
                continue;
            }
            if (!numRegex.matcher(num).matches()) {
                System.out.println("Enter a valid contact number (Ex. 09123456789)!");
                continue;
            }
            return num;
        }
    }

    /**
     * This prompts and captures the user type String from user input.
     *
     * @param keyboardInput the Scanner object for user input
     * @return {@code "ADMIN"} or {@code "USER"}
     */
    static String readUserType(Scanner keyboardInput) {
        String tempType;
        while (true) {
            System.out.printf("%-20s%n", "Select User Type");
            System.out.printf("%-20s", "(Admin, User):");
            tempType = readStringInput(keyboardInput);
            if (tempType.equalsIgnoreCase("admin") || tempType.equalsIgnoreCase("user")) {
                return tempType.toUpperCase();
            }
            System.out.println("Please input a valid option!");
        }
    }

    /**
     * This prompts and captures the required fields for updating the given Account object.
     *
     * @param keyboardInput the Scanner object for user input
     * @param user          the User object to be updated
     */
    static void updateUserAccount(Scanner keyboardInput, Account user) {
        System.out.println("---------------------------------------");
        System.out.printf("%-20s", "Enter First Name:");
        user.setFirstName(readStringInput(keyboardInput));
        System.out.printf("%-20s", "Enter Last Name:");
        user.setLastName(readStringInput(keyboardInput));
        user.setEmail(readEmail(keyboardInput));
        user.setContact(readContact(keyboardInput));
        System.out.printf("%-20s", "Enter Password:");
        user.setPassword(readStringInput(keyboardInput));
        user.setType(readUserType(keyboardInput));
        System.out.println("USER UPDATED!");
    }

    /**
     * This displays a formatted version of the given User object's fields.
     *
     * @param user the User object to be displayed
     */
    static void printUserDetails(Account user) {
        System.out.println("---------------------------------------");
        System.out.println("USER ACCOUNT DETAILS");
        System.out.printf("%-15s%s%n", "First Name:", user.getFirstName());
        System.out.printf("%-15s%s%n", "Last Name:", user.getLastName());
        System.out.printf("%-15s%s%n", "Contact No:", user.getContact());
        System.out.printf("%-15s%s%n", "Email:", user.getEmail());
        System.out.printf("%-15s%s%n", "User Type:", user.getType());
        System.out.printf("%-15s%s%n", "Username:", user.getUsername());
        System.out.printf("%-15s%s%n", "Password:", user.getPassword());
    }

    /**
     * This displays the menu options for the application.
     */
    static void printMenu() {
        System.out.println("---------------------------------------");
        System.out.printf("%6s  %s%n", "i.", "Create an Account");
        System.out.printf("%6s  %s%n", "ii.", "Update an Account");
        System.out.printf("%6s  %s%n", "iii.", "Display Account");
        System.out.printf("%6s  %s%n", "iv.", "Exit");
        System.out.println("---------------------------------------");
    }

    /**
     * This reads a String input using the given Scanner.
     *
     * <p>
     * Includes validation for empty input.
     * </p>
     *
     * @param keyboardInput the given Scanner object for user input
     * @return the input String
     */
    static String readStringInput(Scanner keyboardInput) {
        String input;
        while (true) {
            input = keyboardInput.nextLine().trim();
            if (input.isBlank()) {
                System.out.println("Please enter a value!");
                continue;
            }
            break;
        }
        return input;
    }

    /**
     * This reads the input for the Menu options.
     *
     * <p>
     * Includes validation for empty input and out of range input.
     * </p>
     *
     * @param keyboardInput the Scanner object for user input
     * @return the integer option
     */
    static int readMenuOption(Scanner keyboardInput) {
        while (true) {
            System.out.print("(1-4) > ");
            try {
                int option = Integer.parseInt(keyboardInput.nextLine().trim());
                if (option < 1 || option > 4) {
                    System.out.println("Invalid entry! Please select the proper option from the menu (1-4).");
                    continue;
                }
                return option;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid entry! Please select the proper option from the menu (1-4).");
            }
        }
    }
}