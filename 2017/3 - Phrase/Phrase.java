
/**
 * Write a description of class Phrase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Phrase
{
    private String currentPhrase;

    /**
     * Constructor for objects of class Phrase
     */
    public Phrase(String p)
    {
        currentPhrase = p;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int findNthOccurrence(String str, int n)
    {
        /**
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            index = currentPhrase.indexOf(str, index+1);
        }
        
        return currentPhrase.indexOf(str, index);
        */
       
       return 0;
    }
    
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        String result ="";
        int position = findNthOccurrence(str, n);
        if (position != -1) {
            result += currentPhrase.substring(0, position);
            result += repl;
            result += currentPhrase.substring(position+str.length());
            currentPhrase = result;
        }
    }
    
    public int findLastOccurrence(String str)
    {
        int count = 1;
        
        while (findNthOccurrence(str, count+1) != -1) {
            count++;
        }
        
        return findNthOccurrence(str, count);
    }
    
    public String toString() {
        return currentPhrase;
    }
}
