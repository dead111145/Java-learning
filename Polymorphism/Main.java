/**
 * Created by dead1 on 12/28/2016.
 */
import java.util.*;
public class Main {
    public static void main(String[]args){
        //In this main method, I will test some code which will explain what is the relation ship " it is "
        //Here will be a Company method, and it will accept an B2C object:
        Company Amazon = chooseAmazon();
        System.out.println(Amazon.toString());

        //Following code will test can a sub object accept a super object:

        //B2B ebay = new Company("ebay","Pierre Omidyar", 34600, 21,8.59);

        //If you decomment the above line, you will find that there will be an error occured
        //That means you cannot assign a super object to a sub object
        //And we don't need to test assign a sub object to another different sub object, the answer is obvioudsly no.

    }

    public static Company chooseAmazon(){
        //This is a method which returns a company object
        //It's just a test method to show the relationship between subclass and superclass.
        return new B2C("Amazon", "Jeff Bezos", 268900,22, 107, "kindle",1000);
    }
}
