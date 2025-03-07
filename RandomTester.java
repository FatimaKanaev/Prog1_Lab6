import java.util.Random;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
