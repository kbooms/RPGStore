package com.kevinbooms.services;

import java.util.Scanner;

public class ConsoleService {

    private final Scanner scanner = new Scanner(System.in);

    public int menuPrompt() {
        int menuSelection;
        System.out.println("Please choose an option");
        try {
            menuSelection = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }

    public void printMainMenu() {
        System.out.println("\n---Item Shop Menu---");
        System.out.println("1: List all Items");
        System.out.println("2: List details for specific item");
        System.out.println("3: Find items by name");
        System.out.println("4: Find items by price");
        System.out.println("0: Exit");
    }
}
