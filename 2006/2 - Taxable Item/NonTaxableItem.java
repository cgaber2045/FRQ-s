
/**
 * Write a description of class NonTaxable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NonTaxableItem implements Item
{
    private double listPrice;
    
    /**
     * Constructor for objects of class NonTaxable
     * 
     * @param listPrice the listing price of the item
     */
    public NonTaxableItem(double listPrice)
    {
        this.listPrice = listPrice;
    }
    
    /**
     * Gets the purchase price of the nontaxable item.
     *
     * @return the list price of the item.
     */
    public double purchasePrice()
    {
        return listPrice;
    }    
}
