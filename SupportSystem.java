/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
/*
 * /*
 * Question 2
 * The structure of class documentation shows which package it belongs to
 * Constructor summary: Lists available constructors
 * Method summary: List methods with short descriptions
 * Method details: detailed explanations of each method
 * Inherited methods: Methods inherited from parent classes.
 * Other classes start with the same structure.
 * 
 * Question 3
 * The first version is boolean startsWith(String prefix) and it 
 * checks if the string starts with the given prefix
 * 
 * The second version is boolean startsWith(String prefix, int toffset)
 * It verifies if the substring  starting from toffset starts with the given prefix
 * 
 * Question 4
 * There is a method which is endsWith(String suffix)
 * and its return type is type is boolean
 * 
 * Question 5
 * The method in the String class is length()
 * and it returns the number characters in a string
 * 
 * Question 6
 * I found them by using JavaDocs
 * Methods are easy to find when you know what you're looking for
 * 
 * Question 7
 * Signature of the methos: public String trim()
 * 
 * Question 10 
 * Return type is boolean
 * Question 12
 * Found in java.util package and it's used for generating random numbers
 * 
 * Question 13
 * Random rand = new Random();
 * int randomNumber = rand.nextInt(50);
 * System.out.println(randomNumber);
 *
 */

public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();

            if(input.startsWith("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse();
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
