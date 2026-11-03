package com.svi;

import java.util.Scanner;

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
        String tempFirstName, tempLastName, tempUsername, tempPassword, tempType;
        System.out.println("---------------------------------------");
        System.out.printf("%-20s", "Enter First Name:");
        tempFirstName = readStringInput(keyboardInput);
        System.out.printf("%-20s", "Enter Last Name:");
        tempLastName = readStringInput(keyboardInput);
        System.out.printf("%-20s", "Enter Username:");
        tempUsername = readStringInput(keyboardInput);
        System.out.printf("%-20s", "Enter Password:");
        tempPassword = readStringInput(keyboardInput);
        System.out.printf("%-20s%n", "Select User Type");
        System.out.printf("%-20s", "(Admin, User):");
        tempType = readStringInput(keyboardInput);
        System.out.println("USER CREATED!");
        return new Account(new Person(tempFirstName, tempLastName), new Credentials(tempUsername, tempPassword), tempType);
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
        System.out.printf("%-20s", "Enter Password:");
        user.setPassword(readStringInput(keyboardInput));
        System.out.printf("%-20s%n", "Select User Type");
        System.out.printf("%-20s", "(Admin, User):");
        user.setType(readStringInput(keyboardInput));
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