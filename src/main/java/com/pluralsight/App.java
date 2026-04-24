package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the online store!");

        homeScreen(scanner);

    }
    public static void homeScreen(Scanner scanner) {
        while (true) {
            System.out.println("Select from the following options: ");
            System.out.println("\t1) Display Products");
            System.out.println("\t2) Display Cart");
            System.out.println("\t0) Exit");
            System.out.println("Enter your selection: ");
            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption) {
                case 1:
                    //displayProducts();
                    System.out.println("\n\n");
                    break;
                case 2:
                    //displayCart();
                    System.out.println("\n\n");
                    break;
                case 0:
                    //exit system. 0 is a successful exit
                    System.out.println("Thanks for visiting \uD83D\uDE0A!)");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect option entered (press Enter to continue)");
                    scanner.nextLine();
                    System.out.println("\n\n");

            }
        }
    }

    public static void displayProducts(Scanner scanner) {
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader("src/main/resources/products.csv"));



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void formatSpaces() {
        System.out.println("\n\n");
    }


}
