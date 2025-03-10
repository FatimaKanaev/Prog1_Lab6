import java.util.Arrays;
/**
 * Write a description of class SortingTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortingTest
{
    public void sortAndPrint(int[] numbers){
        Arrays.sort(numbers);
        System.out.println("Sorted Array:");
        for (int num : numbers){
            System.out.println(num + "");
        }
        System.out.println();
    }
}
