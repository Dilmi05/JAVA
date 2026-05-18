package This;

public class Student {
    String firstName,lastName;

    public void setNames(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

    }

    public void setName(String first,String last){
        this.firstName=first;
        this.lastName=last;

    }

    public void display(){
        System.out.println(firstName+lastName);

    }

    public static void main(String args[]){

        Student s = new Student();
        s.setNames("kamanl ","Walimuni");
        s.display();

        s.setName("Amanl ","Walimuni");
        s.display();




    }

}
