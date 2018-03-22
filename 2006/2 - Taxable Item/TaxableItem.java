
/**
 * Abstract class TaxableItem - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class TaxableItem implements Item
{
    
    private double taxRate;
    
    /**
     * Gets the list price of the taxable item.
     */
    public abstract double getListPrice();

    /**
     * Constructor for the class TaxableItem
     *
     * @param rate the current tax rate for the item.
     */
    public TaxableItem(double rate)
    {
        taxRate = rate;
    }
    
    /**
     * Returns the purchase price of an item with tax applied.
     *
     * @return sum of the list price with tax added.
     */
    public double purchasePrice()
    {
        return getListPrice() + getListPrice()*taxRate;
    }    
}
