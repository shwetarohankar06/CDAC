package assignment.in;

public class Program {
    public static void main(String[] args) {
        System.out.println("Welcome to the Airplane Seat Management System!");

        
        int rows = AirplaneSeatUtil.getInput("Enter number of rows: ");
        int columns = AirplaneSeatUtil.getInput("Enter number of columns: ");
        AirplaneSeat manager = new AirplaneSeat(rows, columns);

        boolean exit = false;
        while (!exit) {
            AirplaneSeatUtil.displayMenu();
            int choice = AirplaneSeatUtil.getInput("");

            switch (choice) {
                case 1: // Book a seat
                    int bookRow = AirplaneSeatUtil.getInput("Enter row to book: ");
                    int bookCol = AirplaneSeatUtil.getInput("Enter column to book: ");
                    if (manager.bookSeat(bookRow, bookCol)) {
                        System.out.println("Seat booked successfully.");
                    } else {
                        System.out.println("Seat already booked or invalid seat.");
                    }
                    break;
                case 2: // Cancel a booking
                    int cancelRow = AirplaneSeatUtil.getInput("Enter row to cancel: ");
                    int cancelCol = AirplaneSeatUtil.getInput("Enter column to cancel: ");
                    if (manager.cancelSeat(cancelRow, cancelCol)) {
                        System.out.println("Booking canceled successfully.");
                    } else {
                        System.out.println("No booking found or invalid seat.");
                    }
                    break;
                case 3: // Check seat availability
                    int checkRow = AirplaneSeatUtil.getInput("Enter row to check: ");
                    int checkCol = AirplaneSeatUtil.getInput("Enter column to check: ");
                    if (manager.isSeatAvailable(checkRow, checkCol)) {
                        System.out.println("Seat is available.");
                    } else {
                        System.out.println("Seat is not available.");
                    }
                    break;
                case 4: // Display seating chart
                    manager.displaySeats();
                    break;
                case 5: // Exit
                    exit = true;
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}




