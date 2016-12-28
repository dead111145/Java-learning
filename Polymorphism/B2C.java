/**
 * Created by dead1 on 12/27/2016.
 */
public class B2C extends Company {
    /*
    * For B2C style company, it will have following special fields:
    * String bestSellGoods, int customers.
    * methods:
    * reportBestSellGoods(), reportCustomer()
    * */

    private String bestSellGoods;
    private int customers;

    public B2C(String name, String creator, int size, int age, double earning, String bestSellGoods, int customers) {
        super(name, creator, size, age, earning);
        this.bestSellGoods = bestSellGoods;
        this.customers = customers;
    }

    public void reportBestSellGoods(){
        System.out.println("The best sell goods is " + this.bestSellGoods);
    }

    public void reportCustomer(){
        System.out.println("The customer is " + this.customers);
    }

    @Override
    public String toString() {
        return super.toString() + "Amazon's best sell goods of this year " + this.bestSellGoods
                + "Amazon's customers is " + this.customers;
    }
}
