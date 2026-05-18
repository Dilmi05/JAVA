package Casting.DownCasting;

public class App {
    public static void main(String args[]) {

        Vehicle v = new Car(); // Upcasting

        Car c = (Car) v; // Downcasting (explicit)

        c.run();
        c.drive();
    }
}