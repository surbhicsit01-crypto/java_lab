import java.util.Scanner;

class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] room = new String[1][4];

        while (true) {
            System.out.println("1. Book Room");
            System.out.println("2. Check Availability");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Date: ");
                room[0][0] = sc.nextLine();
                System.out.print("Start Time: ");
                room[0][1] = sc.nextLine();
                System.out.print("End Time: ");
                room[0][2] = sc.nextLine();
                System.out.print("Name: ");
                room[0][3] = sc.nextLine();
                System.out.println("Room Booked Successfully");
            } 
            else if (choice == 2) {
                if (room[0][0] != null)
                    System.out.println("Room already booked by " + room[0][3]);
                else
                    System.out.println("Room is available");
            } 
            else {
                break;
            }
        }
        sc.close();
    }
}