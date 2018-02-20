
/**
 * Write a description of class MasterOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class MasterOrder
{
    // instance variables - replace the example below with your own
    private ArrayList<CookieOrder> orders;
    
    /**
     * Constructor for objects of class MasterOrder
     */
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }
    
    public int getTotalBoxes() {
        int count = 0;
        for (CookieOrder x: orders) {
            count += x.getNumBoxes();
        }
        return count;
    }
    
    public int removeVariety(String cookieVar) {
         int count = 0;
         for (int i = this.orders.size() - 1; i >= 0; i--) {
             if (cookieVar.equals(this.orders.get(i).getVariety())) {
                 count += this.orders.get(i).getNumBoxes();
                 this.orders.remove(i);
             }
         }
         return count;
    }
    
    public String toString() {
        return orders.toString();
    }
}
