import java.util.Scanner;

public class HotelBookingSystem {

    
    private static String[] rooms = new String[10]; 

    public static void main(String[] args) {
        initializeRooms(); 
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Hotel Booking System ---");
            System.out.println("1. View all rooms");
            System.out.println("2. Book a room");
            System.out.println("3. Check out a room");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewRooms();
                    break;
                case 2:
                    bookRoom(scanner);
                    break;
                case 3:
                    checkOutRoom(scanner);
                    break;
                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    
    private static void initializeRooms() {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = "empty";
        }
        System.out.println("Hotel rooms initialized.");
    }

    
    private static void viewRooms() {
        System.out.println("\n--- Room Status ---");
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Room " + (i + 1) + ": " + rooms[i]);
        }
    }

    
    private static void bookRoom(Scanner scanner) {
        System.out.print("Enter room number to book (1-10): ");
        int roomNumber = scanner.nextInt();

        if (roomNumber < 1 || roomNumber > rooms.length) {
            System.out.println("Invalid room number.");
            return;
        }

        int index = roomNumber - 1; 

        if (rooms[index].equals("empty")) {
            System.out.print("Enter guest name: ");
            scanner.nextLine(); 
            String guestName = scanner.nextLine();
            rooms[index] = guestName;
            System.out.println("Room " + roomNumber + " booked for " + guestName + ".");
        } else {
            System.out.println("Room " + roomNumber + " is already occupied by " + rooms[index] + ".");
        }
    }

    
    private static void checkOutRoom(Scanner scanner) {
        System.out.print("Enter room number to check out (1-10): ");
        int roomNumber = scanner.nextInt();

        if (roomNumber < 1 || roomNumber > rooms.length) {
            System.out.println("Invalid room number.");
            return;
        }

        int index = roomNumber - 1; 

        if (!rooms[index].equals("empty")) {
            String guestName = rooms[index];
            rooms[index] = "empty";
            System.out.println("Guest " + guestName + " checked out of Room " + roomNumber + ".");
        } else {
            System.out.println("Room " + roomNumber + " is already empty.");
        }
    }
}