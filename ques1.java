class ques1 {
    public static void main(String[] args) {
        String[] stocks = {"TATA", "INFY"};
        int[][] prices = {
            {100, 105, 110},   // TATA prices
            {200, 210, 215}    // INFY prices
        };

        String[] time = {"10AM", "12PM", "2PM"};

        for (int i = 0; i < stocks.length; i++) {
            System.out.println("Stock: " + stocks[i]);
            for (int j = 0; j < time.length; j++) {
                System.out.println(time[j] + " : " + prices[i][j]);
            }
            System.out.println();
        }
    }
}