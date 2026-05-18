package Constructor;

public class Student {

    String name;
    int age;
    char gender;

    Student(String s,int a,char g){
        name=s;
        age=a;
        gender=g;

        System.out.println("Parameterized Constructor");
        System.out.println("Name:"+name+",Age:"+age+",Gender:"+gender);



    }
}
