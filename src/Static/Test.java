package Static;

class Test {

    static int x;

    static {
        x = 100;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println(x);
    }
}
