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

    while(true){
        if(user.varify(pinIP)){
         
         }else{
            system.out.println("Invalid pin, please try again!");
         }
    }
    }
}