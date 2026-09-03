import java.util.Scanner;

import ATMOperations.Operations;
import ATMOperations.Credentials;

public class ATM {
    public static void main(String[] args) {

        // User se input lene ke liye Scanner
        Scanner scanner = new Scanner(System.in);

        // User ke credentials aur operations ka object
        Credentials user = new Credentials();
        Operations operation = new Operations(user);

        System.out.print("Welcome to KBR Bank, ");

        // ATM ko continuously run karne ke liye loop
        while (true) {
            System.out.println("Enter Pin for varification!");
            int pinIP = scanner.nextInt();

            // Entered PIN ko actual PIN se verify karta hai
            if (user.verifyPin(pinIP)) {
                System.out.println("1. Check Balence \n2. Withdraw \n3. Bank Statements \n4. Reset Pin \n5. Exit");
                short code = scanner.nextShort();

                // User ke selected option ke according operation perform hota hai
                switch (code) {
                    case 1:
                        operation.checkBalence();
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        int withdrawAmount = scanner.nextInt();
                        operation.withdraw(withdrawAmount);
                        break;

                    case 3:
                        user.showBankStatements();
                        break;

                    case 4:
                        System.out.print("Enter old Pin: ");
                        int oldPin = scanner.nextInt();

                        System.out.print("Enter new Pin: ");
                        int newPin = scanner.nextInt();

                        // Old PIN correct hone par new PIN set hota hai
                        if (user.resetPin(oldPin, newPin)) {
                            System.out.println("Pin changed successfully!");
                        } else {
                            System.out.println("Incorrect old Pin!");
                        }
                        break;

                    case 5:
                        System.out.println("Thanks for using KBR");
                        scanner.close();
                        return;

                    // Agar 1-5 ke alawa koi option diya
                    default:
                        System.err.println("Enter value between 1-5");
                }
            } else {
                // Galat PIN hone par dobara PIN maangta hai
                System.out.println("Incorrect Pin, try again!");
            }
        }
    }
}