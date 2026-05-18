package Polymorphism.OverLoading;
//by changing data type of argument
public class App {
    void sum(int a,int b) {
        System.out.println(a+b);

    }
     void sum(double a,double b) {
        System.out.println(a+b);

    }
     public static void main(String[] args) {
         App obj=new App();
         obj.sum(10.5,10.5);
         obj.sum(20,20);
    }

}
