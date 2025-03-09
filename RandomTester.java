import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/*
 * Question 15
 * It will generate a random number from 0 to 99
 * if you want a number between 1 and 100, write random.nextInt(100)+1
 * 
 */

public class RandomTester
{
    private Random r = new Random();
    private ArrayList<String> responses;
    
    public void printOneRandom(){
        System.out.println(" new integer:"+ r.nextInt(500));
    }
    
    public void printMultiRandom(int howMany){
        for (int i = 0; i < howMany; i++){
            System.out.println(" new integer:"+ r.nextInt(500));
        }
    }
    
    public int throwDice(){
        return r.nextInt(6)+1;
    }
    
    public RandomTester(){
        responses = new ArrayList<>();
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
    }
    
    public int getRandomInRange(int min,int max){
        return r.nextInt((max-min)+1)+min;
    }
    
    public int getRandom(int max){
        return getRandomInRange(1,max);
    }
}
