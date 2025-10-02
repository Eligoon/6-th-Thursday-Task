package Task_1;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // Create an ArrayList to hold Customer objects
        ArrayList<Customer> customers = new ArrayList<>();

        // Add new Customer objects to the list
        customers.add(new Customer("Elvira", "B", "Chilli17"));
        customers.add(new Customer("Selene", "Yli", "Cupcake55555"));
        customers.add(new Customer("Charlie", "Noor", "MotherBear13"));

        // Call the method to print all customers in the list
        printCustomers(customers);
    }

    // Static method to print all Customer objects in the list
    private static void printCustomers(ArrayList<Customer> customers)
    {
        // For each Customer in the list, print the object (uses toString())
        for (Customer c : customers)
        {
            System.out.println(c);
        }
    }
}

