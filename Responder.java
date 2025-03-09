import java.util.ArrayList;
import java.util.Random;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private ArrayList<String> defaultResponses;
    private Random r;
    private String lastResponse = "";
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        defaultResponses = new ArrayList<>();
        fillDefaultResponses();
        r = new Random();
    }

    public String generateResponse()
    {
        return "That sounds interesting. Tell me more...";
    }
    
    /**
     * Populates the responses list
     */
    private void fillDefaultResponses(){
        defaultResponses.add("Have you trid restarting your computer?");
        defaultResponses.add("Please check if your software is up to date.");
        defaultResponses.add("Try reopening the application");
        defaultResponses.add("Make sure the internet connection is stable");
        defaultResponses.add("I need more details to help with this problem");
    }
    
    public String pickDefaultResponse(){
        String response;
        do{
            int index = r.nextInt(defaultResponses.size());
            response = defaultResponses.get(index);
        } while (response.equals(lastResponse));
        lastResponse = response;
        return response;
    }
    
}
