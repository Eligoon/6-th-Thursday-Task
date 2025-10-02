package Task_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe
{
    // Declare and initialize the list to store coffee names
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    // Getter method to provide access to the private coffeeMenu list
    public ArrayList<String> getCoffeeMenu()
    {
        return coffeeMenu;
    }

    // Method to load coffee names from the text file into the coffeeMenu list
    public void loadMenuData()
    {
        try
        {
            // Create a File object pointing to "coffees.txt" in the project root
            File file = new File("coffees.txt");

            // Create a Scanner to read from the file
            Scanner scan = new Scanner(file);

            // Read each line (coffee name) from the file and add it to the list
            while(scan.hasNextLine())
            {
                coffeeMenu.add(scan.nextLine());
            }

        } catch (FileNotFoundException e)
        {
            // Print error message if the file cannot be found
            System.out.println("File not found.");
        }
    }
}

