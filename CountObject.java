class CountObject {
    static int count = 0;

    CountObject() {
        count++;
    }

    public static void main(String[] args) {
        CountObject o1 = new CountObject();
        CountObject o2 = new CountObject();
        CountObject o3 = new CountObject();

        System.out.println("Number of objects created: " + count);
    }
}
