import java.util.HashMap;

/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/*
 * Question 28
 * The existing value is replaced with a new value
 * 
 * Question 29
 * Both keys and their associated values are stored seperately
 * 
 * Question 30
 * we use a containsKey() method : System.out.println(map.containsKey("Fatima"));
 * 
 * Question 31
 * The get() method returns as ''null''
 * 
 * Question 32
 * We have to use the keySet() method to print out all the keys stored in a map
 */

public class MapTester
{
    private HashMap<String,String> phoneBook = new HashMap<>();
    
    public void enterNumber(String name, String number){
        phoneBook.put(name,number);
    }
    
    public String lookupNumber(String name){
        return phoneBook.get(name);
    }
}
