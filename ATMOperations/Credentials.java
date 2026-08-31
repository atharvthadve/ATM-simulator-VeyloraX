package ATMOperations;

import java.util.ArrayList;

public class Credentials {

    // User ka current PIN
    private int pin = 2129;

    // Account ka current balance
    private double balence = 70230;

    // Bank transactions store karne ke liye list
    private ArrayList<String> bankStatements = new ArrayList<>();

    // Current PIN return karta hai
    public boolean verifyPin(int enteredPin) {
        return pin == enteredPin;
    }

    // Old PIN verify karke new PIN set karta hai
    public boolean resetPin(int oldPin, int newPin) {
        if (pin == oldPin) {
            pin = newPin;
            return true;
        }
        return false;
    }

    // Current balance return karta hai
    public double getBalence() {
        return balence;
    }

    // Balance update karta hai
    public void setBalence(double balence) {
        this.balence = balence;
    }

    // Naya bank statement add karta hai
    public void addStatement(String statement) {
        bankStatements.add(statement);
    }

    // Saare bank statements show karta hai
    public void showBankStatements() {
        if (bankStatements.size() == 0) {
            System.out.println("No bank statements available.");
            return;
        }

        System.out.println("\n---------- Bank Statements ----------");

        for (int i = 0; i < bankStatements.size(); i++) {
            System.out.println((i + 1) + ". " + bankStatements.get(i));
        }

        System.out.println("-------------------------------------");
    }
}