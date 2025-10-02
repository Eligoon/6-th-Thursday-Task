package Task_1;

public class Customer
{
    // Fields to store customer details
    private String firstName;
    private String lastName;
    private String username;

    // Each customer has a unique ID assigned automatically
    private int id;

    // Static counter shared across all Customer instances to auto-increment IDs
    private static int counter;

    // Constructor to initialize a new Customer object
    public Customer(String firstName, String lastName, String username)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;

        // Increment the counter for each new customer
        counter++;

        // Assign the current counter value as the customer's ID
        this.id = counter;
    }

    // Override toString() to define how a Customer is printed
    @Override
    public String toString()
    {
        return "Customer name: " + firstName + " " + lastName + ". Their username: " + username + ". and ID: " + id;
    }

    // Getter and setter methods for each field (no setter for id)

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public int getId()
    {
        return id;
    }
}

