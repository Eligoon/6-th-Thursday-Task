package Task_2;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // Create a new instance of the Cafe class
        Cafe cafe = new Cafe();

        // Load coffee menu data from the coffees.txt file
        cafe.loadMenuData();

        // Get the list of coffee names using the getter method
        ArrayList<String> coffees = cafe.getCoffeeMenu();

        // Loop through each coffee name and print it
        for (String c : coffees)
        {
            System.out.println(c);
        }
    }
}

