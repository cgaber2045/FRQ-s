
/**
 * Write a description of class NumberCube here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Arrays;

public class NumberCube
{
    /**
     * Rolls a random number between 1 and 6, inclusive
     * 
     * @return an integer between 1 and 6, inclusive
     */
    
    public int toss()
    {
        
        return 1 + (int)(Math.random() * ((6 - 1) + 1));
        
    }
    
}
