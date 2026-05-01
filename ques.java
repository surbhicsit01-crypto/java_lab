import java.util.Scanner;

public class ques {

    static double balance = 5000.0;   // initial balance

    static void withdraw(double amount) {

        if (amount > balance) {
            throw new IllegalStateException(
                "Insufficient funds! Available balance: " + balance
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Current Balance: " + balance);
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            withdraw(amount);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}