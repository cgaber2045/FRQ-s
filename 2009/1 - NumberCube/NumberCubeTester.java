
/**
 * Write a description of class NumberCubeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class NumberCubeTester
{
    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int[] rolls = new int[numTosses];
        
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = cube.toss();
        }
        
        return rolls;
    }
    
    public static int getLongestRun(int[] values) {
        int index = 0;
        int countMax = 0;
        int count = 0;
        
        for (int i = 0; i < values.length-1; i++) {
            int j = 1;
            
            while (values[i] == values[i+j]) {
                count++;
                j++;
            }
            
            if (count > countMax) {
                countMax = count;
                index = i - countMax;
            } 
            
            else count = 0;
        }
        
       if (countMax > 1) return index;
       else return -1;
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
