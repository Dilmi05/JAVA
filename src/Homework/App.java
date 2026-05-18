package Homework;

public class App {

    public static void main(String args[]) {

        BoxWeight obj = new BoxWeight(10, 20, 30, 40);

        System.out.println("Width = " + obj.width);
        System.out.println("Height = " + obj.height);
        System.out.println("Depth = " + obj.depth);
        System.out.println("Weight = " + obj.weight);
    }
}
