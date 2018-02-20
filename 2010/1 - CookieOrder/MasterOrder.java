
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
     * Add theOrder to the master order.
     *
     * @param  theOrder  the cookie order to add to the master order.
     */
    
    public void addOrder(CookieOrder theOrder)
    {
        
        orders.add(theOrder);
        
    }
    
    /**
     * @return the sum of the number of boxes of all cookie orders.
     */
    
    public int getTotalBoxes() {
        
        int count = 0;
        
        for (CookieOrder x: orders) {
            
            count += x.getNumBoxes();
            
        }
        
        return count;
    }
    
    /**
     * Removes all cookie orders from the master order that have the same 
     * variety of cookie as cookieVar and returns the total number of boxes that were removed.
     *
     * @param  cookieVar  the variety of cookies to be removed from the master order.
     * @return the total number of boxes of cookieVar in the cookie orders removed.
     */
    
    public int removeVariety(String cookieVar) {
         int count = 0;
         
         for (int i = this.orders.size() - 1; i >= 0; i--) {
             
             CookieOrder goodies = this.orders.get(i);
             
             if (cookieVar.equals(goodies.getVariety())) {
                 
                 count += goodies.getNumBoxes();
                 this.orders.remove(i);
                 
             }
             
         }
         
         return count;
    }
    
    /** @return the arraylist of all orders.
     */
    public String toString() {
        
        return orders.toString();
        
    }
}
