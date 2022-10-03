package ui;
// import for reading input
import java.util.Scanner;

import domain.Caesar;
import domain.mirrorring;

public class main {
    public static void main(String[] args) {
        // ask user the user in terminal for a string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.nextLine();
        // ask which encryption method the user wants to use
        System.out.println("Enter 1 for mirrorring or 2 for Caesar: ");
        int choice = scanner.nextInt();
        // call the correct method
        if (choice == 1) {
            System.out.println("The mirrored string is: " + mirrorring.mirrorring(text));
        } else if (choice == 2) {
            // ask for decryption or encryption
            System.out.println("Enter 1 for encryption or 2 for decryption: ");
            int choice2 = scanner.nextInt();
            // ask for the shift
            System.out.println("Enter the shift: ");
            int shift = scanner.nextInt();
            if (choice2 == 1) {
                System.out.println("The encrypted string is: " + Caesar.encrypt(text, shift));
            } else if (choice2 == 2) {
                System.out.println("The decrypted string is: " + Caesar.decrypt(text, shift));
            }
        } else {
            System.out.println("Invalid choice!");
        }

    }
}

