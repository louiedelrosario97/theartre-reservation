package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Add Scanner
        System.out.print("Please enter your name: "); // Prompt for name
        String fullName = scan.nextLine(); // Scan for prompt above

        System.out.print("What date will you be coming (MM/DD/YYYY): "); //Prompt for date
        String dateOfShow = scan.nextLine(); // Scan for prompt above
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //Use 'DateTimeFormatter'
        LocalDate reservationDate = LocalDate.parse(dateOfShow, formatter);

        System.out.print("How many tickets would you like? : ");
        int numberOfTickets = scan.nextInt();

        if (numberOfTickets > 1) {
            System.out.println("You have " + numberOfTickets + " tickets reserved for " + reservationDate + " under " + fullName + ".");
        } else {
            System.out.println("You have " + numberOfTickets + " ticket reserved for " + reservationDate + " under " + fullName + ".");
        }
    }
}




