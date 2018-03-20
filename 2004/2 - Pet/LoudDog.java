
/**
 * Write a description of class LoudDog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoudDog extends Dog
{
    /**
     * Constructor for objects of class LoudDog
     */
    public LoudDog(String name) {
        super(name);
    }
    
    /**
     * makes the dog speak loudly
     * @return the sound the dog makes twice.
     */
    public String speak() {
        return super.speak() + " " + super.speak();
    }
}
