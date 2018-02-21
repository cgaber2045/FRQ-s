
/**
 * Write a description of class Digits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Digits
{
    
    private ArrayList<Integer> digitList;

    /**
     * Constructor for objects of class Digits
     * @param num A number to be split into digits for the digitList.
     */
    public Digits(int num)
    {
        
        digitList = new ArrayList<Integer>();
        int currentNum = num;
        int digit = 0;
        
        if (currentNum == 0) digitList.add(0);
        
        while (currentNum > 0) {
            
            digit = currentNum%10;
            digitList.add(0, digit);
            currentNum /= 10;
            
        }
        
    }

    /**
     * Returns true or false depending on if the ArrayList digitList is strictly increasing.
     *
     * @return true or false depending on if the ArrayList digitList is strictly increasing.
     */
    public boolean isStrictlyIncreasing()
    {
        for (int i = 0; i < digitList.size()-1; i++) {
            
            if (digitList.get(i) >= digitList.get(i+1)) return false;
            
        }
        
        return true;
    }
}
