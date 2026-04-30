class Employee {
    int id;
    String name;
    double salary;

    Employee(int i, String n) {
        id = i;
        name = n;
        salary = 0;
    }

    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class ques4 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice");
        Employee e2 = new Employee(102, "Bob", 45000);

        e1.display();
        e2.display();
    }
}
