
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Tester
{
    public static void main(String args[]) {
        Pet d = new Dog("Jake");
        Pet c = new Cat("Jaina");
        Pet ld = new LoudDog("Sparky");
        
        ArrayList petList = new ArrayList();
        petList.add(d);
        petList.add(c);
        petList.add(ld);
        
        Kennel k = new Kennel(petList);
        k.allSpeak();
    }
}
