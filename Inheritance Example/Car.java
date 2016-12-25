public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gear;
    private boolean isManual;

    private int currentGear;

    public Car( int gear, boolean isManual, int currentGear) {
        super("car", "Middle");
        this.wheels = 4;
        this.doors = 4;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = currentGear;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    @Override
    public void move(int speed, int direction){
        super.move(speed,direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }
    
}
