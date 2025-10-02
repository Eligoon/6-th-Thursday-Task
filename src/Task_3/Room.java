package Task_3;

public class Room
{
    // Number of lamps in the room
    private int numberOfLamps;

    // Number of windows in the room
    private int numberOfWindows;

    // Constructor to create a room with a specified number of lamps and windows
    public Room(int numberOfLamps, int numberOfWindows)
    {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfLamps()
    {
        return numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps)
    {
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfWindows()
    {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows)
    {
        this.numberOfWindows = numberOfWindows;
    }
}
