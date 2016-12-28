/**
 * Created by dead1 on 12/25/2016.
 */
public class Debit_Card {
    /*
    * bad example
    * public int cardNumber;
    * public double deposit;
    * public String ownerName;
    * */

    private int cardNumber;
    private double deposit;
    private String ownerName;

    public Debit_Card(int cardNumber, double deposit, String ownerName) {
        this.cardNumber = cardNumber;
        this.deposit = deposit;
        this.ownerName = ownerName;
    }

    public void deposit(double deposition){
        if(deposit >= deposition){
            System.out.println("You deposit $" + deposition);
            deposit -= deposition;
        }else{
            System.out.println("You don't have enough money in your account");
        }
    }

    public void save(double money){
        System.out.println("You saved $" + money);
        deposit += money;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public double getDeposit() {
        return deposit;
    }

    public String getOwner() {
        return ownerName;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setOwner(String ownerName) {
        this.ownerName = ownerName;
    }
}
