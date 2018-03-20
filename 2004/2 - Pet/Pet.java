
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Pet
{
    
    private String myName;
    
    /**
     * Constructor for objects of class Pet
     */
    public Pet(String name) {
        myName = name;
    }
    
    /**
     * gets the name of the Pet
     * @return name of pet
     */
    public String getName() {
        return myName;
    }
    
    /**
     * makes the pet speak.
     */
    public abstract String speak();
}
