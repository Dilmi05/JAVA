package This;

public class Account {
    int a;
    int b;

    public void setData(int a,int b){
        this.a=a;
        this.b=b;


    }

    public void display(){
        System.out.println("A:"+a);
        System.out.println("B:"+b);

    }


    public static void main(String args[]){

        Account c = new Account();

        c.setData(10,20);
        c.display();
    }
}
