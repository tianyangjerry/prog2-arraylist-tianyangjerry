package prog2.exercise5.collections;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Turn-A-New-Leaf Bookstore");
        OrderProcessing orderProcessing = new OrderProcessing();
        while (true) {
            System.out.println("Type 1 to place new orders.");
            System.out.println("Type 2 to search for a user’s order.");
            System.out.println("Type 3 to remove a user’s order.");
            System.out.println("Type 4 to display all of the orders");
            System.out.println("And 5 to quit.");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Place new orders");
                    orderProcessing.addOrder();
                    break;
                case 2:
                    System.out.println("Search for a user’s order");
                    System.out.println("Enter the user ID");
                    String userID = scanner.nextLine();
                    orderProcessing.searchUserOrders(userID);
                    break;
                case 3:
                    System.out.println("Remove a user’s order");
                    System.out.println("Enter the user ID");
                    String userIDToRemove = scanner.nextLine();
                    orderProcessing.removeUserOrders(userIDToRemove);
                    break;
                case 4:
                    System.out.println("Display all of the orders");
                    orderProcessing.displayAllUserOrders();
                    break;
                case 5:
                    System.out.println("Quit");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
