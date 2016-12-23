//Super class Car, Version 1:
class Car{
  private int wheels;
  //private int gasoline;
  //private String driver;
  
  //full cnstructor
  public Car(int wheels){
    this.wheels = wheels;
  }
  
  //The following function will be representing with a string output.
  public void forward(){
    System.out.println("Move forward");
  }
  
  public void turnRight(){
    System.out.println("Turn right.");
  }
  
  public void turnLeft(){
    System.out.println("Turn left");
  }
  
}

//sub class truck
/*
  The truck is the sub class of Car class, so
  any truck object can access all the Car's public method;
*/
class Truck extends Car{
  private int gasoline;
  private double goods;
  private String driver;
  
  //constructor
  //Notice that in the subclass's constructor 
  //you must call the super class's constructor
  //by calling super() with corresponding parameter
  
  public Truck(int wheels,int gasoline, double goods, String driver){
    super(wheels);
    this.gasoline = gasoline;
    this.goods = goods;
    this.driver = driver;
  }
  
  public loadGood(double load){
    goods += load;
  }

}

public class Inheritance{
  public static void main(String args){
    Truck t1 = new Truck(8,50, 5.5, "Davis");
    t1.forward();
    //t1 is a Truck object as a sub class of Car
    //so it can call methods from super class.
  }
}
