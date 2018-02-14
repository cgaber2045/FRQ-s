
/**
 * Write a description of class NumberCubeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class NumberCubeTester
{
    /** Returns an array of the values obtained by tossing a number cube numTosses times.
     * @param cube a NumberCube
     * @param numTosses the number of tosses to be recorded
     * @return an array of numTosses values
     */
    
    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        
        int[] rolls = new int[numTosses];
        
        for (int i = 0; i < rolls.length; i++) {
            
            rolls[i] = cube.toss();
            
        }
        
        return rolls;
    }
    
    /** Returns the starting index of a longest run of two or more consevutive repeated values in the array values.
     * @param values an array of integer values representing a series of number cube tosses.
     * @return the starting index of a run of maximum size;
     */
    
    public static int getLongestRun(int[] values) {
        int index = 0;
        int countMax = 0;
        int count = 0;
        
        for (int i = values.length-2; i >= 0; i--) {
            
            if (values[i] == values[i+1]) {
                
                count++;
                
                if (countMax < count) {
                    countMax = count;
                    index = i;
                } 
                
            } 
            
            else {
                
                count = 0;
                
            }
        }
        
       return index;
    }
    
    public static void main(String args[]) {
        NumberCube c1 = new NumberCube();
        int[] r1 = getCubeTosses(c1, 18);
        System.out.println(Arrays.toString(r1));
        System.out.println(getLongestRun(r1));
        
        NumberCube c2 = new NumberCube();
        int[] r2 = getCubeTosses(c2, 18);
        System.out.println(Arrays.toString(r2));
        System.out.println(getLongestRun(r2));
    }
}
