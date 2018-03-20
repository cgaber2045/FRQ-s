
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Pet
{
    /**
     * Constructor for objects of class Dog
     */
    public Dog(String name) {
        super(name);
    }
    
    /**
     * makes the dog speak
     * @return the sound the dog makes.
     */
    public String speak() {
        return "bark";
    }
}
