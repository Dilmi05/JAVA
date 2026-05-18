package Static;

public class Calculator {
    static int add(int a, int b){
        return a+b;
    }

    public static void main(String args[]){
        int result =Calculator.add(1,5);
        System.out.println(result);
    }
}

