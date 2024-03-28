package prog2.exercise5.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class OrderProcessing {
    private double transactionAmount;
    private String orderType;
    private String bookOrdered;
    public ArrayList<OrderDetails> orders;
    public HashMap<User, OrderDetails> userOrders;

    public OrderProcessing() {
        this.orders = new ArrayList<>();
        this.userOrders = new HashMap<>();
    }

    public OrderProcessing(double transactionAmount, String orderType, String bookOrdered, ArrayList<OrderDetails> orders, HashMap<User, OrderDetails> userOrders) {
        this.transactionAmount = transactionAmount;
        this.orderType = orderType;
        this.bookOrdered = bookOrdered;
        this.orders = new ArrayList<>();
        this.userOrders = new HashMap<>();
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    /*public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }*/

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getBookOrdered() {
        return bookOrdered;
    }

    public void setBookOrdered(String bookOrdered) {
        this.bookOrdered = bookOrdered;
    }

    public ArrayList<OrderDetails> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<OrderDetails> orders) {
        this.orders = orders;
    }

    public HashMap<User, OrderDetails> getUserOrders() {
        return userOrders;
    }

    public void setUserOrders(HashMap<User, OrderDetails> userOrders) {
        this.userOrders = userOrders;
    }

    @Override
    public String toString() {
        return "Order Type: " + orderType + "\n" +
                "Book Ordered: " + bookOrdered + "\n" +
                "Transaction Amount: " + transactionAmount + "\n" +
                "Orders: " + orders + "\n" +
                "User Orders: " + userOrders;
    }

    public void addOrder() {
        System.out.println("Enter your first name: ");
        String firstName = System.console().readLine();
        System.out.println("Enter your last name: ");
        String lastName = System.console().readLine();
        System.out.println("Enter your email address: ");
        String email = System.console().readLine();

        String userID = generateUserID(firstName, lastName);

        String orderID = generateOrderID(userID);

        User user = new User(firstName, lastName, email, userID);

        OrderDetails orderDetails = new OrderDetails(orderID, LocalDate.now());

        for (Books books : Books.values()) {
            System.out.println(books);
        }

        System.out.println("Enter the book ID you want to order: ");
        String bookID = System.console().readLine();

        for (Books book : Books.values()) {
            if (bookID.equals(book.getBookID())) {
                System.out.println("Do you want to purchase or rent the book? ");
                String orderType = System.console().readLine();

                String bookOrdered = "Book ID: " + book.getBookID() + "\n" +
                        "Book Name: " + book.getBookName() + "\n" +
                        "Book Author: " + book.getBookAuthor() + "\n" +
                        "Book Publisher: " + book.getBookPublisher() + "\n" +
                        "Book Price: " + book.getBookPrice();

                orderDetails.setOrderTransactionAmount(book.getBookPrice());
                orderDetails.setOrderedBook(bookOrdered);
                orderDetails.setOrderType(orderType);
                userOrders.put(user, orderDetails);
            }
        }

        System.out.println("Do you want to order more books? (yes/no) ");
        String answer = System.console().readLine();
        if (answer.equals("yes")) {
            addOrder();
        }
        userOrders.put(user, orderDetails);
    }

    public String generateUserID(String firstName, String lastName) {
        String name = firstName + lastName;
        return "TANLUS" + name.substring(0, 5).toUpperCase();
    }

    public String generateOrderID(String userID) {
        return "TANLOD" + LocalDate.now() + userID.substring(6, 9).toUpperCase();
    }

    public OrderDetails searchUserOrders(String userID) {
        for (User user : userOrders.keySet()) {
            if (user.getUserID().equals(userID)) {
                System.out.println(userOrders.get(user));
                return userOrders.get(user);
            }
        }
        return null;
    }

    public void removeUserOrders(String userID) {
        for (User user : userOrders.keySet()) {
            if (user.getUserID().equals(userID)) {
                userOrders.remove(user);
            }
        }
    }

    public void displayAllUserOrders() {
        for (User user : userOrders.keySet()) {
            System.out.println(user);
            System.out.println(userOrders.get(user));
        }
    }

}