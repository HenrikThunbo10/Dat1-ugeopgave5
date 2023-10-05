package Task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Customer> CustomerArray = new ArrayList<>();
        Customer Customer1 = new Customer("Henrik ", "Thunbo10");
        CustomerArray.add(Customer1);
        Customer Customer2 = new Customer("Masih ", "joyboy");
        CustomerArray.add(Customer2);
        Customer Customer3 = new Customer("Peter ", "pePandakage");
        CustomerArray.add(Customer3);
        Customer Customer4 = new Customer("Tobias ", "Tobirama");
        CustomerArray.add(Customer4);

        printCustomers(CustomerArray);
    }

    public static void printCustomers(ArrayList<Customer> CustomerArray) {
        for (Customer i : CustomerArray) {
            System.out.println(i);
        }
    }

}
