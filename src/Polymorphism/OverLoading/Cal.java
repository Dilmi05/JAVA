package Polymorphism.OverLoading;

public class Cal {
    void sum(double a,int b) {
        System.out.println(a+b);
    }

    void sum(int a,double b) {
        System.out.println(a+b);

    }
     public static void main(String[] args){
        Cal obj=new Cal();
        obj.sum(10.5,2);
        obj.sum(1,20.5);
    }

}
