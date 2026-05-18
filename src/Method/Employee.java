package Method;

public class Employee {

    String name;
    int id;


    public void insertRecord(String s ,int i){
        name=s;
        id=i;
    }

    public void display(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
    }
}
