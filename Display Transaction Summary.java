import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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
        if (patients.isEmpty()) {
            System.out.println("No active transactions.");
        } else {
            System.out.println("Active transactions:");
            for (Patient patient : patients) {
                System.out.println("Ticket Number: " + patient.getTicket().getTicketNumber());
                System.out.println("Name: " + patient.getName());
                System.out.println("Address: " + patient.getAddress());
                System.out.println("Phone Number: " + patient.getPhoneNumber());
                System.out.println("Service: " + patient.getServiceType());
                System.out.println("Status: " + patient.getStatus());
                System.out.println();
            }
        }
    }

    private static void finishTransaction() {
        if (patients.isEmpty()) {
            System.out.println("No patients in queue.");
        } else {
            Patient finishedPatient = patients.remove(0);
            finishedPatient.setStatus("Finished");
            System.out.println("Finished processing ticket number: " + finishedPatient.getTicket().getTicketNumber());
        }
    }

    private static void adminFunction() {
        // Implement adminFunction functionality
    }

    private static void exitProgram() {
        System.out.println("Exiting program.");
    }
}

// Assuming the Patient class is defined elsewhere with the necessary methods
class Patient {
    // Placeholder for actual Patient class implementation
    private Ticket ticket;
    private String name;
    private String address;
    private String phoneNumber;
    private String serviceType;
    private String status;

    public Ticket getTicket() {
        return ticket;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class Ticket {
    // Placeholder for actual Ticket class implementation
    private int ticketNumber;

    public int getTicketNumber() {
        return ticketNumber;
    }
}
