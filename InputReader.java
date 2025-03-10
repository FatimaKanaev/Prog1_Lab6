import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class InputReader
{
    /*
     * Question 39
     * The getInput() method reads user input, transforms it into lowercase, splits it into individual words
     * and stores them in a HashSet<String>.
     * Class variables and methods (marked as static) are associated with the class itself rather than with instances. 
     * The Arrays class provides useful methods such as:
     * sort(), binarySearch(), asList(), and equals().
     * 
     * Question 40
     * sort()
     * equals()
     * asList()
     * fill()
     * toString()
     * binarySearch()
     * copyOf()
     * 
     */
    
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    
    public HashSet<String> getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine().trim().toLowerCase();

        String[] wordArray = inputLine.split(" ");
        
        HashSet<String> words = new HashSet<>();
        for (String word : wordArray){
            words.add(word);
        }
        return words;
    }
}
