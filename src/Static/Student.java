package Static;

public class Student {
    static String school= "ABC School";
    String name;

    Student(String name){
        this.name=name;
    }

    void display(){
        System.out.println(name+"-"+school);
    }

    public static void main(String args[]){
        Student s1 = new Student("Kamanl");
        Student s2 = new Student("Amanl");

        s1.display();
        s2.display();

    }
}
