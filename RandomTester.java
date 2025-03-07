import java.util.Random;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/*
 * Question 15
 * It will generate a random number from 0 to 99
 * if you want a number between 1 and 100, write rand.nextInt(100)+1
 * 
 */

public class RandomTester
{
    private Random r = new Random();
    
    public void printOneRandom(){
        System.out.println(" new integer:"+ r.nextInt(500));
    }
    
    public void printMultiRandom(int howMany){
        for (int i = 0; i < howMany; i++){
            System.out.println(" new integer:"+ r.nextInt(500));
        }
    }
}
