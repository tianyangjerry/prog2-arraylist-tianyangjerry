package prog2.exercise5.collections;

public class User {
    private String firstName;
    private String lastName;
    private String userEmail;
    private String userID;


    public User() {
    }

    public User(String firstName, String lastName, String userEmail, String userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userEmail = userEmail;
        this.userID = userID;
    }

    /**
     * 获取
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 获取
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 获取
     * @return userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取
     * @return userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * 设置
     * @param userID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String toString() {
        return "User ID: " + userID + "\n" +
                "User First Name: " + firstName + "\n" +
                "User Last Name: " + lastName + "\n" +
                "User Email: " + userEmail;
    }
}
