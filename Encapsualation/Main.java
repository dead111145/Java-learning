/**
 * Created by dead1 on 12/25/2016.
 */
public class Main {
    public static void main(String[]args){
        /*
        * bad example:
        * Debit_Card DC = new Debit_Card();
        *
        * Once you changed the variable name "owner" to "ownerName"
        * There will be an error for this line causing inconvience.
        *
        * DC.owner = "DQ";
        * */
        Debit_Card DC = new Debit_Card(12345678, 0, "DQ");
        DC.deposit(300);
        DC.save(500);
    }
}
