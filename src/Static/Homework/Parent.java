package Static.Homework;

class Parent {

    static {
        System.out.println("1. Parent static block");
    }

    Parent() {
        System.out.println("4. Parent constructor");
    }
}