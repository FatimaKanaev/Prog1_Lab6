import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    /*
     * Question 23
     * When you add more responses to the list, the random selection will still work properly because r.nextInt(responses.size()) 
     * always picks an index within the available range. But,if you remove all responses,it will cause an error. We can prevent this
     * by checking the list, if it's empty, before calling r.nextInt().
     * 
     * Question 24
     * Hash Map in Java is a part of the java.util package and is used to 
     * store key value pairs. A hashMap  uses a hash table to store the keys.
     * It provides a way to store and retrieve data using unique keys
     * 
     * Question 25
     * Types of methods: put, get, containsKey, containsValue, remove, entrySet,
     * keySet, Values. I think it can be used for both of its parameters.
     * 
     * Question 26
     * We can use the size() method to check the amount of entries in a map.
     * 
     * Question 34
     * Similarities:
     * Both store elements and allow iteration
     * Both can be modified dynamically
     * 
     * Differences:
     * HashSet doesnt allow duplicates, while ArrayLists does
     * HashSet is unordered, while ArrayList maintains insertion order
     * 
     * Question 35
     * It uses a regular expression to split a string
     * Split by space or tab and Split by colon(:)
     * 
    */
    
    private ArrayList<String> defaultResponses;
    private Random r;
    private String lastResponse = "";
    private HashMap<String,String> responsesMap;

    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        defaultResponses = new ArrayList<>();
        fillDefaultResponses();
        r = new Random();
        responsesMap = new HashMap<>();
        fillResponsesMap();
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
    
    private void fillResponsesMap(){
        responsesMap.put("slow", "Try restarting your computer");
        responsesMap.put("error", "Check for software update");
        responsesMap.put("frozen", "no way other than reboot");
        responsesMap.put("crash", "Your system crashed. Try reinstalling.");
        responsesMap.put("network", "Check your router and network settings.");
        responsesMap.put("bug","Try reinstalling the software.");
        responsesMap.put("update","Make sure you have the latest update installed.");
        responsesMap.put("password","Try resetting your password.");
        responsesMap.put("wifi","Check if your Wi-FI router is working properly.");
    }
    
    public String generateResponse(HashSet<String> words){
        ArrayList<String> matchedResponses = new ArrayList<>();
        for (String word : words){
            String response = responsesMap.get(word);
            if (response != null){
                matchedResponses.add(response);
            }
        }
        
        if (!matchedResponses.isEmpty()){
            return String.join("", matchedResponses);
        }
        return pickDefaultResponse();
    }
}
