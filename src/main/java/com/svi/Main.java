package com.svi;

import java.util.Scanner;

public class Main {
    static void main() {
        String tempFirstName, tempLastName, tempUsername, tempPassword;
        Scanner keyboardInput = new Scanner(System.in);
        while (true) {
            int menuOption = readMenuOption(keyboardInput);
            switch (menuOption) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                    System.out.println("Bye bye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid entry! Please select the proper option from the menu (1-4).");
            }
        }
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
