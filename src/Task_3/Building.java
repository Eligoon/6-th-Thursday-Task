package Task_3;

import java.util.ArrayList;

public class Building
{
    // List to hold Room objects that belong to this building
    private ArrayList<Room> rooms = new ArrayList<>();

    // Number of floors in the building
    private int numberOfFloors;

    // Constructor to initialize a building with a given list of rooms and number of floors
    public Building(ArrayList<Room> rooms, int numberOfFloors)
    {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    public ArrayList<Room> getRooms()
    {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms)
    {
        this.rooms = rooms;
    }

    public int getNumberOfFloors()
    {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors)
    {
        this.numberOfFloors = numberOfFloors;
    }
}
