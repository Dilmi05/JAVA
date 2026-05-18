package DB;

public class main {

    public static void main(String args[]){
         basicdata b= new basicdata();
         b.createtable();

         insertdata d= new insertdata();
         d.insert();
         d.display();




    }
}
