class Employee {
    String name;
    int yearOfJoining;
    String address;

    Employee(String n, int y, String a) {
        name = n;
        yearOfJoining = y;
        address = a;
    }

    void display() {
        System.out.println(name + "\t" + yearOfJoining + "\t\t" + address);
    }

    public static void main(String[] args) {
        System.out.println("Name\tYear of Joining\tAddress");

        Employee e1 = new Employee("Ujwal", 2024, "BBS");
        Employee e2 = new Employee("Ravi", 2023, "KUR");
        Employee e3 = new Employee("Amit", 2022, "DEL");

        e1.display();
        e2.display();
        e3.display();
    }
}
