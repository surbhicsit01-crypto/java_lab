class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area: " + (3.14 * radius * radius));
    }

    void circumference() {
        System.out.println("Circumference: " + (2 * 3.14 * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.area();
        c.circumference();
    }
}
