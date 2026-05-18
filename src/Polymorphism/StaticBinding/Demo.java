package Polymorphism.StaticBinding;

public class Demo {

    public static void main(String[] args) {

        Car c = new Car();
        c.show();

        Vehicle v = new Car();
        v.show();
    }
}