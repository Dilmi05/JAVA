package Super;

public class Car extends Vehicle{

    public void Start(){
        color = "Red";
        super.drive();
        System.out.println("Staring");
        System.out.println("Color:"+super.color);

    }
}
