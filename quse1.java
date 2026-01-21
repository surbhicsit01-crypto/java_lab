import java.util.Scanner;

public class quse1 {
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("Employee"+i);
            System.out.print("Enter Nmae:");
            String name = sc.next();
            System.out.println("Enter ID:");
            int id = sc.nextInt();
            System.out.print("Enter Salary:");
            double salary= sc.nextDouble();
            System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
            System.out.println();
        }
    }
}
