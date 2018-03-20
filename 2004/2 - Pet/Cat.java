
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Pet
{
    /**
     * Constructor for objects of class Cat
     */
    public Cat(String name) {
        super(name);
    }
    
    /**
     * makes the cat speak
     * @return the sound the cat makes.
     */
    public String speak() {
        return "meow";
    }
}
