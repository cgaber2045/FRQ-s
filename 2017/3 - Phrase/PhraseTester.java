
/**
 * Write a description of class PhraseTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhraseTester
{
    public static void main(String args[]) {
        Phrase phrase1 = new Phrase("A cat ate late");
        phrase1.replaceNthOccurrence("at", 1, "rane");
        System.out.println(phrase1);
        
        System.out.println(phrase1.findNthOccurrence("at", 4));
        System.out.println(phrase1.findLastOccurrence("at"));
        
    }
}
