
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle extends TaxableItem
{

    private double dealerMarkup;
    private double dealerCost;

    /**
     * Constructor for objects of class Vehicle
     * 
     * @param rate the tax rate on the car.
     * @param dealerCost the cost for the dealer to buy the car
     * @param dealerMarkup the amount the dealer takes on the car
     */
    public Vehicle(double rate, double dealerCost, double dealerMarkup)
    {
        super(rate);
        this.dealerMarkup = dealerMarkup;
        this.dealerCost = dealerCost;
    }
    
    /**
     * Gets the list price for the vehicle.
     *
     * @return  the dealer markup plus the dealer cost.
     */
    public double getListPrice() {
        return dealerMarkup + dealerCost;
    }
    
    /**
     * Changes the markup of the car to a new one.
     *
     * @param  newMarkup  the new amount for the dealer markup.
     */
    public void changeMarkup(double newMarkup)
    {
        dealerMarkup = newMarkup;
    }
}
