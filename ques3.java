class ques3 {
    public static void main(String[] args) {
        String[][] booking = new String[1][4];

        booking[0][0] = "10-02-2026";  // Date
        booking[0][1] = "10AM";        // Start time
        booking[0][2] = "12PM";        // End time
        booking[0][3] = "Surbhi";     // Name

        String date = "10-02-2026";
        String start = "10AM";
        String end = "12PM";

        if (booking[0][0].equals(date) &&
            booking[0][1].equals(start) &&
            booking[0][2].equals(end)) {
            System.out.println("Room already booked by " + booking[0][3]);
        } else {
            System.out.println("Room is available");
        }
    }
}