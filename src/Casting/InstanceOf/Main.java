package Casting.InstanceOf;

public class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        Car c = new Car();
        Vehicle v2 = new Car();

        System.out.println(c instanceof Car);       // true
        System.out.println(c instanceof Vehicle);   // true
        System.out.println(c instanceof Object);    // true

        System.out.println(v instanceof Car);       // false

        System.out.println(v2 instanceof Car);      // true
        System.out.println(v2 instanceof Vehicle);  // true

        v2.start();

        // Downcasting
        Car c2 = (Car) v2;
        c2.drive();
    }
}