package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the online store!");

        System.out.println("Select from the following options: ");
        System.out.println("\t) Display Products");
        System.out.println("\t) Display Cart");
        System.out.println("\t0) Exit");
        System.out.println("Enter you selection: ");
        int userOption = scanner.nextInt();

    }
}
