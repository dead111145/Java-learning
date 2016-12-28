/**
 * Created by dead1 on 12/27/2016.
 */
public class C2C extends Company {
    /*
    * For C2C style company, it will have following special fields:
    * double amount, int seller
    * */

    private double amount;
    private int seller;

    public C2C(String name, String creator, int size, int age, double earning, double amount, int seller) {
        super(name, creator, size, age, earning);
        this.amount = amount;
        this.seller = seller;
    }

    @Override
    public String toString() {
        return super.toString() + "Its trade amount is " + this.amount + ". It has " + this.seller + "sellers onine.";
    }
}
