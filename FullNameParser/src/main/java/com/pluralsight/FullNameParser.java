package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String input = scanner.nextLine().trim();

        String[] parts = input.split(" ");

        String firstName = parts[0];
        String middleName = "(none)";
        String lastName;

        if (parts.length == 2) {
            lastName = parts[1];
        } else if (parts.length == 3) {
            middleName = parts[1];
            lastName = parts[2];
        } else {
            System.out.println("Invalid name format.");
            return;
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}