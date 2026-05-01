import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean success = false;

        while (!success) {
            try {
                System.out.print("Enter numerator: ");
                int a = sc.nextInt();

                System.out.print("Enter denominator: ");
                int b = sc.nextInt();

                int result = a / b;
                System.out.println("Result: " + result);
                success = true;
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
                System.out.println("Please try again.\n");
            }
        }
    }
}
