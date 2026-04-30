import java.util.*;

class Multiply {

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    int multiply(int[] arr) {
        int result = 1;
        for (int i : arr)
            result *= i;
        return result;
    }
}

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Multiply m = new Multiply();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers (* to stop):");

        while (true) {
            String input = sc.next();
            if (input.equals("*"))
                break;
            list.add(Integer.parseInt(input));
        }

        if (list.size() == 2) {
            System.out.println("Method for Two numbers called (Result): "
                    + m.multiply(list.get(0), list.get(1)));
        } 
        else if (list.size() == 3) {
            System.out.println("Method for Three numbers called (Result): "
                    + m.multiply(list.get(0), list.get(1), list.get(2)));
        } 
        else {
            int[] arr = list.stream().mapToInt(i -> i).toArray();
            System.out.println("Method for multiple numbers called (Result): "
                    + m.multiply(arr));
        }
    }
}
