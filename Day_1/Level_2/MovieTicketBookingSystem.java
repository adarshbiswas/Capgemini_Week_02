// Q.4) Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
//Book a ticket (assign seat and update price).
//Display ticket details.

// Import all classes
import java.util.Scanner;

// Create a MovieTicket class with attributes movieName, seatNumber, and price
class MovieTicket {

    // set attributes
    private String movieName;
    private int seatNumber = -1;
    private double price = 0.0;

    // Create a constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        // Default value
    }

    // Getters for attributes (optional, if needed elsewhere)
    public String getMovieName() {
        return movieName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    // Method to book a ticket
    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("\nTicket booked successfully!");
    }

    void getTicketDetails() {
        if (seatNumber == -1) {
            System.out.println("\nNo ticket booked yet.");
        } else {
            System.out.println("\n--- Ticket Details ---");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
            System.out.println("------------------------");
        }
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {

        // Create an instance object of Scanner class
        Scanner in = new Scanner(System.in);

        // Get movie details from the user
        System.out.print("Enter the movie name: ");
        String movieName = in.nextLine();

        // Create object of MovieTicket class
        MovieTicket ticket = new MovieTicket(movieName);

        // Book a ticket
        System.out.print("Enter the seat number to book: ");
        int seatNumber = in.nextInt();

        System.out.print("Enter the ticket price: ");
        double price = in.nextDouble();

        ticket.bookTicket(seatNumber, price);

        // Display the ticket details
        ticket.getTicketDetails();

        in.close();

    }
}
