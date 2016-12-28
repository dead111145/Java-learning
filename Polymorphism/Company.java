/**
 * Created by dead1 on 12/27/2016.
 */
public class Company {
    /*
    * This class is designed to represent the great company
    * working in the IT area, including Search provider, B2C style, C2C company, driving provider
    *
    * The company class has the following field:
    * name, creator, size, age, earning.
    * Earning will be in billion dollars.
    * It will have following methods:
    * payTax(); changeName(); employ(); lay off(); reportProfit(); toString();
    * */

    //Field
    private String name;
    private String creator;
    private int size;
    private int age;
    private double earning;

    public Company(String name, String creator, int size, int age, double earning) {
        this.name = name;
        this.creator = creator;
        this.size = size;
        this.age = age;
        this.earning = earning;
    }

    public void payTax(double taxRate){
        earning -= earning * taxRate;
    }

    public void changeName(String name){
        this.name = name;
    }

    public void employ(int employment){
        size += employment;
    }

    public void layOff(int cutNumber){
        size -= cutNumber;
    }

    public double reportProfit(){
        return earning;
    }

    public String toString(){
        return this.name + "'s creator is " + this.creator + ", it has " + this.age +
                " years history, this year its earning is " + this.earning;
    }
}
