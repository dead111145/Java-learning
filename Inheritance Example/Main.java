public class Main
{
    public static void main(String[]args){
        System.out.println("Test");
        Car c1 = new Car(0,true,0);
        c1.changeGear(5);
        c1.move(10,5);
        c1.steer(5);
    }
}
