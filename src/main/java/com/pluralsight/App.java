package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

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
            System.out.print("Enter your selection: ");
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
                    System.out.println("Thanks for visiting \uD83D\uDE0A!");
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
        HashMap<String, Products> products = loadInventory();

        boolean run = true;
        while (run) {
            System.out.println("Select from the following options: ");
            System.out.println("\t1) View All Products");
            System.out.println("\t2) Search Products");
            System.out.println("\t3) Add Product");
            System.out.println("\t0) Exit");
            System.out.print("Enter your selection: ");
            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption) {
                case 1:
                    for (Products p : products.values()) {//views all
                        System.out.printf("%s: $%.2f%n", p.getProductName(), p.getPrice());
                    }
                    formatSpaces();
                    break;
                case 2:
                    //search p
                    break;
                case 3:
                    //add p
                    break;
                case 0:
                    formatSpaces();
                    run = false;
                    break;
                default:
                    System.out.println("Incorrect option entered(press Enter to continue)");
                    scanner.nextLine();
                    formatSpaces();
            }
        }


    }

    public static HashMap<String, Products> loadInventory() {
        HashMap<String, Products> products = new HashMap<>();
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader("src/main/resources/products.csv"));

            String productItem;
            buffReader.readLine();
            while((productItem = buffReader.readLine()) != null) {
                String[] splitProductItem = productItem.split(Pattern.quote("|"));

                String sku = splitProductItem[0];
                String productName = splitProductItem[1];
                double price = Double.parseDouble(splitProductItem[2]);
                String department = splitProductItem[3];

                Products product = new Products(sku, productName, department, price);
                products.put(sku, product);


            }

            buffReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }

    public static void formatSpaces() {
        System.out.println("\n\n");
    }


}
