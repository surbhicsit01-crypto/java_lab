abstract class Shape {
    abstract double findArea();
}

class Square extends Shape {
    double side;

    Square(double s) {
        side = s;
    }

    double findArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double findArea() {
        return length * breadth;
    }
}

public class ques3 {
    public static void main(String[] args) {
        Shape s1 = new Square(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println("Area of Square: " + s1.findArea());
        System.out.println("Area of Rectangle: " + s2.findArea());
    }
}
