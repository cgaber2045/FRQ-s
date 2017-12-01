
/**
 * Write a description of class College here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class College
{
    private String name;
    private String region;
    private int tuition;
    
    /**
     * Constructor for College.
     * 
     * @param name name of the college.
     * @param  region  region of the college.
     * @param  tuition  cost of tuition of the college.
     */
    
    public College(String name, String region, int tuition)
    {
        this.name = name;
        this.region = region;
        this.tuition = tuition;
    }
    
    /**
     * Gets the name of object.
     * @return name  name of the object
     */
    
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the region of object.
     * @return region  region of the object
     */
    
    public String getRegion()
    {
        return region;
    }
    
    /**
     * Gets the tuition of object.
     * @return tuition  tuition of the object.
     */
    
    public int getTuition()
    {
        return tuition;
    }
    
    /**
     * Sets the tuition of object.
     */
    
    public void setTuition(int newTuition)
    {
        this.tuition = newTuition;
    }
    
    public String toString() {
        return name + ", " + region + ", " + tuition;
    }
}
