package Task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    public Customer(String firstName, String userName) {
        this.firstName = firstName;
        this.userName = userName;

    }

    public String toString() {

        return firstName + userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }
}
