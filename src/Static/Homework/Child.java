package Static.Homework;

class Child extends Parent {

    static int x = printStatic();

    static {
        System.out.println("2. Child static block");
    }

    int y = printInstance();

    {
        System.out.println("3. Instance block");
    }

    Child() {
        System.out.println("5. Child constructor");
    }

    static int printStatic() {
        System.out.println("Child static variable");
        return 10;
    }

    int printInstance() {
        System.out.println("Instance variable");
        return 20;
    }
}
