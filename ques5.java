class Shape {
    void about() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    void about() {
        System.out.println("This is a Circle");
    }
}

public class ques5 {
    public static void main(String[] args) {
        Shape s = new Circle(); // Polymorphism
        s.about();
    }
}
