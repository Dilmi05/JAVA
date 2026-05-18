package Polymorphism.DynamicBinding;

public class Demo {

    public static void main(String[] args) {

        Car c = new Car();
        c.start();

        Vehicle v = new Car();
        v.start();
    }
}
