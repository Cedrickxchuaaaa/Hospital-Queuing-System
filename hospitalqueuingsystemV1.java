import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Ticket {
    private int ticketNumber;

    public Ticket() {
        ticketNumber = (int) (Math.random() * 100) + 1;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }
}

class Patient {
    private String name;
    private String address;
    private String phoneNumber;
    private String serviceType;
    private Ticket ticket;
    private String status;

    public Patient(String name, String address, String phoneNumber, String serviceType, Ticket ticket) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.serviceType = serviceType;
        this.ticket = ticket;
        this.status = "Ongoing";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getServiceType() {
        return serviceType;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

public class HospitalQueuingSystem {
    private static List<Patient> patients = new ArrayList<>();
    private static List<Patient> transactionHistory = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Hospital Queuing System ---");
            System.out.println("1. Start Transaction");
            System.out.println("2. Generate Ticket");
            System.out.println("3. Display Transaction Summary");
            System.out.println("4. Finish Transaction");
            System.out.println("5. Admin Function: Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            try {
                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        startTransaction();
                        break;
                    case 2:
                        generateTicket();
                        break;
                    case 3:
                        displayTransactionSummary();
                        break;
                    case 4:
                        finishTransaction();
                        break;
                    case 5:
                        adminFunction();
                        break;
                    case 6:
                        exitProgram();
                        return; // Ensure the loop exits
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // Consume the invalid input
            }
        }
    }

    private static void startTransaction() {
        // Implement startTransaction functionality
    }

    private static void generateTicket() {
        // Implement generateTicket functionality
    }

    private static void displayTransactionSummary() {
        // Implement displayTransactionSummary functionality
    }

    private static void finishTransaction() {
        // Implement finishTransaction functionality
    }

    private static void adminFunction() {
        // Implement adminFunction functionality
    }

    private static void exitProgram() {
        System.out.println("Exiting program.");
    }
}
