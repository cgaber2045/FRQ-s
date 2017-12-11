
/**
 * Write a description of class PhraseTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhraseTester
{
    public static void main(String args[]) {
        //Phrase 1
        Phrase phrase1 = new Phrase("A cat ate late");
        phrase1.replaceNthOccurrence("at", 1, "rane");
        System.out.println(phrase1);
        
        //Phrase 2
        Phrase phrase2 = new Phrase("A cat ate late");
        phrase2.replaceNthOccurrence("at", 6, "xx");
        System.out.println(phrase2);
        
        //Phrase 3
        Phrase phrase3 = new Phrase("A cat ate late");
        phrase3.replaceNthOccurrence("bat", 2, "xx");
        System.out.println(phrase3);
        
        //Phrase 4
        Phrase phrase4 = new Phrase("aaaa");
        phrase4.replaceNthOccurrence("aa", 1, "xx");
        System.out.println(phrase4);
        
        //Phrase 5
        Phrase phrase5 = new Phrase("aaaa");
        phrase5.replaceNthOccurrence("aa", 2, "bbb");
        System.out.println(phrase5);
        
        //Test Phrase
        Phrase testphrase = new Phrase("A cat ate late");
        System.out.println(testphrase.findNthOccurrence("at", 3));
    }
}
