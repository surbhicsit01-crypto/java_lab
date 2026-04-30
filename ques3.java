import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine().trim();

        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long");
            return;
        }

        // Convert first character to uppercase if needed
        password = Character.toUpperCase(password.charAt(0)) + password.substring(1);

        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch))
                hasDigit = true;
            else if (!Character.isLetterOrDigit(ch))
                hasSpecial = true;
        }

        if (hasDigit && hasSpecial) {
            System.out.println("Valid Password: " + password);
        } else {
            System.out.println("Password must contain at least one digit and one special character");
        }
    }
}
