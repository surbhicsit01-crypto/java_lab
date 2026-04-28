class ques4 {
    public static void main(String[] args) {
        int[][][] seats = new int[2][3][4]; // Screens, Rows, Seats

        seats[0][1][2] = 1; // booked seat

        for (int s = 0; s < seats.length; s++) {
            System.out.println("Screen " + (s + 1));
            for (int r = 0; r < seats[s].length; r++) {
                for (int c = 0; c < seats[s][r].length; c++) {
                    System.out.print(seats[s][r][c] + " ");
                }
                System.out.println();
            }
        }
    }
}