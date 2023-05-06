package weekThree;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        int floors;
        int totalRooms;
        int rooms;
        int totalOccupied;
        int occupied;
        int vacantRooms;
        double occupancy;

        Scanner keyboard = new Scanner(System.in);

        totalRooms = 0;
        totalOccupied = 0;

        System.out.print("How many floors does the " + "hotel have? ");
        floors = keyboard.nextInt();

        while (floors < 1)
        {
            System.out.print("Invalid. Enter 1 or more: ");
            floors = keyboard.nextInt();
        }
        for (int i = 0; i < floors; i++)
        {
            System.out.print("How many rooms does floor " + (i + 1) + " have? ");
            rooms = keyboard.nextInt();

            while (rooms < 10)
            {
                System.out.print("Invalid. Enter 10 or more: ");
                rooms = keyboard.nextInt();
            }
            totalRooms += rooms;

            System.out.print("How many occupied rooms does floor " + (i + 1) + " have?");
            occupied = keyboard.nextInt();

            while (occupied > rooms || occupied < 0)
            {
                System.out.print("Invalid. Must be " + rooms + " or less. Re-enter: ");
                occupied = keyboard.nextInt();
            }
            totalOccupied += occupied;
        }
        vacantRooms = totalRooms - totalOccupied;
        occupancy = (double)totalOccupied / totalRooms;

        System.out.println("Number of rooms: " + totalRooms);
        System.out.println("Occupied rooms: " + totalOccupied);
        System.out.println("Vacant rooms: " + vacantRooms);
        System.out.printf("Occupancy rate: %.2f%%\n",(occupancy * 100));
    }
}
