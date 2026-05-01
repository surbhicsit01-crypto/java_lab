import java.util.Scanner;

public class qu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            validate(password);
            System.out.println("Password is valid.");
        } catch (IllegalArgumentException e) {
            System.out.println("Password error: " + e.getMessage());
        }
    }

    static void validate(String password) {

        if (password.length() < 6) {
            throw new IllegalArgumentException(
                "Password must be at least 6 characters long."
            );
        }

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i))) {
                throw new IllegalArgumentException(
                    "Password must contain only numbers."
                );
            }
        }
    }
}