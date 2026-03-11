class Toyota implements Car {

    public void run() {
        System.out.println("Toyota is running at speed: " + speed);
    }

    public void stop() {
        System.out.println("Toyota has stopped.");
    }

    public void boost() {
        System.out.println("Toyota speed boosted.");
    }

    public static void main(String[] args) {
        Toyota t = new Toyota();
        t.run();
        t.boost();
        t.stop();
    }
}