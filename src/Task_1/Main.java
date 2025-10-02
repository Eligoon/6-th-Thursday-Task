package Task_1;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Elvira", "B", "Chilli17"));
        customers.add(new Customer("Selene", "Yli", "Cupcake55555"));
        customers.add(new Customer("Charlie", "Noor", "MotherBear13"));

        printCustomers(customers);
    }

    private static void printCustomers(ArrayList<Customer> customers)
    {
        for (Customer c : customers)
        {
            System.out.println(c);
        }
    }
}
