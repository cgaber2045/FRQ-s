
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
    
    public College(String name, String region, int tuition)
    {
        this.name = name;
        this.region = region;
        this.tuition = tuition;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getRegion()
    {
        return region;
    }
    
    public int getTuition()
    {
        return tuition;
    }
    
    public void setTuition(int newTuition)
    {
        this.tuition = newTuition;
    }
    
    public String toString() {
        return name + ", " + region + ", " + tuition;
    }
}
