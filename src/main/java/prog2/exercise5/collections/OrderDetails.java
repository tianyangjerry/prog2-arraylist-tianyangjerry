package prog2.exercise5.collections;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrderDetails {
    private String orderID;
    private double orderTransactionAmount;
    private LocalDate orderDate;
    public ArrayList<String> orderedBook;
    public ArrayList<String> orderType;
    public OrderDetails(String orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.orderedBook = new ArrayList<>();
        this.orderType = new ArrayList<>();
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public double getOrderTransactionAmount() {
        return orderTransactionAmount;
    }

    public void setOrderTransactionAmount(double orderTransactionAmount) {
        this.orderTransactionAmount = orderTransactionAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<String> getOrderedBook() {
        return orderedBook;
    }

    public void setOrderedBook(String orderedBook) {
        this.orderedBook.add(orderedBook);
    }

    public void setOrderType(String orderType) {
        this.orderType.add(orderType);
    }

    public ArrayList<String> getOrderType() {
        return orderType;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderID + "\n" +
                "Ordered Book: " + orderedBook + "\n" +
                "Order Date: " + orderDate + "\n" +
                "Order Transaction Amount: " + orderTransactionAmount;
    }
}
