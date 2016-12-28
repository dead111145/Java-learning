/**
 * Created by dead1 on 12/27/2016.
 */
public class SearchProvider extends Company {
    /*
    * Online research providers have some special fields:
    * String keyWordOfYear, int AlphaGoLevel
    * methods:
    * reportKeyWordOfYear, increaseAlphaGoLevel
    * */

    private String keyWordOfYear;
    private int AlphaGoLevel;

    public SearchProvider(String name, String creator, int size, int age, double earning, String keyWordOfYear) {
        super(name, creator, size, age, earning);
        this.keyWordOfYear = keyWordOfYear;
    }

    public void reportKeyWordOfYear(){
        System.out.println("The key word of year is " + keyWordOfYear);
    }

    @Override
    public String toString(){
        return super.toString() + "The key word searched of this year is " + keyWordOfYear + ". ";
    }
}
