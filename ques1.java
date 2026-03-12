import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Uppercase to lowercase
        System.out.print("Enter uppercase string: ");
        String upper = sc.nextLine();
        System.out.println("Lowercase: " + upper.toLowerCase());

        // Lowercase to uppercase
        System.out.print("Enter lowercase string: ");
        String lower = sc.nextLine();
        System.out.println("Uppercase: " + lower.toUpperCase());

        // Remove spaces from sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Without spaces: " + sentence.replace(" ", ""));
    }
}
