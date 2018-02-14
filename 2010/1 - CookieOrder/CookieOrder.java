
/**
 * Write a description of class CookieOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CookieOrder
{
    // instance variables - replace the example below with your own
    private String variety;
    private int numBoxes;

    /**
     * Constructor for objects of class CookieOrder
     */
    public CookieOrder(String variety, int numBoxes)
    {
        this.variety = variety;
        this.numBoxes = numBoxes;
    }

    /** @return the variety of cookie being ordered.
     */
    public String getVariety()
    {
        return variety;
    }
    
    /** @return the number of boxes being ordered.
     */
    public int getNumBoxes()
    {
        return numBoxes;
    }
}
