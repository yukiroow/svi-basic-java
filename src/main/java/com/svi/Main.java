package com.svi;

import java.util.Scanner;

public class Main {
    static void main() {
        User user = null;
        Scanner keyboardInput = new Scanner(System.in);
        while (true) {
            int menuOption = readMenuOption(keyboardInput);
            switch (menuOption) {
                case 1 -> {
                    user = createUser(keyboardInput);
                }
                case 2 -> {
                }
                case 3 -> {
                    if (user == null) {
                        System.out.println("Please create a User first!");
                        continue;
                    }
                    printUserDetails(user);
                }
                case 4 -> {
                    System.out.println("Bye bye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid entry! Please select the proper option from the menu (1-4).");
            }
        }
    }

    static User createUser(Scanner keyboardInput) {
        String tempFirstName, tempLastName, tempUsername, tempPassword;
        System.out.printf("%-20s","Enter First Name:");
        tempFirstName = readStringInput(keyboardInput);
        System.out.printf("%-20s","Enter Last Name:");
        tempLastName = readStringInput(keyboardInput);
        System.out.printf("%-20s","Enter Username:");
        tempUsername = readStringInput(keyboardInput);
        System.out.printf("%-20s","Enter Password:");
        tempPassword = readStringInput(keyboardInput);
        return new User(tempFirstName, tempLastName, tempUsername, tempPassword);
    }

    static void printUserDetails(User user) {
        System.out.println("USER DETAILS");
        System.out.printf("%-15s%s%n", "First Name:", user.getFirstName());
        System.out.printf("%-15s%s%n", "Last Name:", user.getLastName());
        System.out.printf("%-15s%s%n", "Username:", user.getUsername());
        System.out.printf("%-15s%s%n", "Password:", user.getPassword());
    }

    static String readStringInput(Scanner keyboardInput) {
        String input = "";
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

    static int readMenuOption(Scanner keyboardInput) {
        System.out.printf("%6s  %s%n", "i.", "Create an Account");
        System.out.printf("%6s  %s%n", "ii.", "Update an Account");
        System.out.printf("%6s  %s%n", "iii.", "Display Account");
        System.out.printf("%6s  %s%n", "iv.", "Exit");
        while (true) {
            System.out.print("(1-4) > ");
            try {
                int option = Integer.parseInt(keyboardInput.nextLine().trim());
                if (option < 1 || option > 5) {
                    continue;
                }
                return option;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid entry! Please select the proper option from the menu (1-4).");
            }
        }
    }
}
