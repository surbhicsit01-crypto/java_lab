import java.util.Scanner;
import java.util.regex.Pattern;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (Pattern.matches(regex, email)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
