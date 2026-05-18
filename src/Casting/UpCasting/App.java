package Casting.UpCasting;

public class App {
    public static void main(String args[]){
        Vehicle v= new Car();
        v.run();

        //v.drive();(not allowed(vehicle reference)

    }
}
