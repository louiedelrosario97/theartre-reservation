package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        String fullName = scan.nextLine();

        System.out.print("Date of Show (MM/DD/YYYY): ");
        String dateOfShow = scan.nextLine();
        DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.print("Enter # of Tickets: ");
        int numberOfTickets = scan.nextInt();

        if (numberOfTickets > 1) {
            System.out.println("You have " + numberOfTickets + " tickets reserved for " + DateFormat + " under " + fullName + ".");
        } else {
            System.out.println("You have " + numberOfTickets + " ticket reserved for " + DateFormat + " under " + fullName + ".");
        }
    }
}




