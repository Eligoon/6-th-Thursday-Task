package Task_3;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // Create individual Room objects with given number of lamps and windows
        Room lRoom = new Room(5, 3); // Living room with 5 lamps and 3 windows
        Room bRoom = new Room(1, 1); // Bedroom with 1 lamp and 1 window
        Room kRoom = new Room(3, 2); // Kitchen with 3 lamps and 2 windows

        // Create an ArrayList to store the rooms
        ArrayList<Room> rooms = new ArrayList<>();

        // Add the Room objects to the rooms list
        rooms.add(lRoom);
        rooms.add(bRoom);
        rooms.add(kRoom);

        // Create a Building object using the rooms list and specifying 1 floor
        Building newBuilding = new Building(rooms, 1);

        // Calculate total number of lamps in the building
        int sumOfLamps = countLampsInBuilding(newBuilding);

        // Calculate total number of windows in the building
        int sumOfWindows = countWindowsInBuilding(newBuilding);

        // Count how many rooms are in the building
        int sumOfRooms = countRoomsInBuilding(newBuilding);

        // Output the total counts to the console
        System.out.println("The total sum of lamps in the building: " + sumOfLamps);
        System.out.println("The total sum of windows in the building: " + sumOfWindows);
        System.out.println("The total sum of rooms in the building: " + sumOfRooms);

        // Check if the building meets the "normal" condition and print the result
        System.out.println("The building is normal: " + isNormal(newBuilding));
    }

    // This method calculates and returns the total number of lamps in all rooms of the building
    public static int countLampsInBuilding(Building building)
    {
        int sumOfLamps = 0;

        // Loop through each room and sum the number of lamps
        for (Room room : building.getRooms())
        {
            sumOfLamps += room.getNumberOfLamps();
        }

        return sumOfLamps;
    }

    // This method calculates and returns the total number of windows in all rooms of the building
    public static int countWindowsInBuilding(Building building)
    {
        int sumOfWindows = 0;

        // Loop through each room and sum the number of windows
        for (Room room : building.getRooms())
        {
            sumOfWindows += room.getNumberOfWindows();
        }

        return sumOfWindows;
    }

    // This method returns the total number of rooms in the building
    public static int countRoomsInBuilding(Building building)
    {
        return building.getRooms().size(); // Use size() to get number of elements in the rooms list
    }

    // This method checks whether the building is "normal"
    // A building is considered normal if it has at least as many rooms as it has floors
    public static boolean isNormal(Building building)
    {
        return building.getNumberOfFloors() <= building.getRooms().size();
    }
}