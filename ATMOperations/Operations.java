package ATMOperations;

public class Operations {

    // User ke credentials aur balance ko access karne ke liye
    private Credentials user;

    // Credentials object ko initialize karta hai
    public Operations(Credentials user) {
        this.user = user;
    }

    // Current balance show karta hai
    public void checkBalence() {
        System.out.println("Your current balence = " + user.getBalence());
    }

    // Account se amount withdraw karta hai
    public void withdraw(int deduct) {

        // Amount valid hai ya nahi check karta hai
        if (deduct <= 0) {
            System.out.println("Enter valid amount!");
            return;
        }

        // Balance se zyada amount withdraw nahi kar sakte
        if (deduct > user.getBalence()) {
            System.out.println("Insufficient balence!");
            return;
        }

        // Balance se withdrawal amount minus karta hai
        user.setBalence(user.getBalence() - deduct);

        // Withdrawal ka statement save karta hai
        user.addStatement("Withdraw: " + deduct + " | Balence: " + user.getBalence());

        System.out.println(deduct + ", Withdraw successfully!");
        System.out.println("Your current balence = " + user.getBalence());
    }
}