package Method;

public class EmpMain {

    public static void main(String args[]){
        Employee e1= new Employee();
        Employee e2= new Employee();


        e1.insertRecord("Kanamal",13);
        e2.insertRecord("Amal",12);

        e1.display();
        e2.display();

    }
}
