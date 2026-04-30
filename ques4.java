import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        char lastChar = s1.charAt(s1.length() - 1);
        char firstChar = s2.charAt(0);

        if (lastChar == firstChar) {
            System.out.println("Output: " + s1 + s2);
        } else {
            System.out.println("Characters do not match");
        }
    }
}
