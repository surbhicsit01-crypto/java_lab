import mymath.MathOperations;
import java.util.Scanner;

class UsePackage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations m = new MathOperations();

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        System.out.println("Square Root: " + m.squareRoot(n));
        System.out.println("Square: " + m.square(n));
        System.out.println("Cube: " + m.cube(n));
    }
}