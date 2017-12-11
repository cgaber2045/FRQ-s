
/**
 * Write a description of class Phrase here.
 *
 * @author Chris Gaber
 * @version 12/11/17
 */
public class Phrase
{
    
    private String currentPhrase;

    /**
     * Constructor for objects of class Phrase
     * @param p The phrase that you want tested.
     */
    public Phrase(String p)
    {
        
        currentPhrase = p;
        
    }

    /**
     * Finds the index of the Nth occurrence of a sting.
     *
     * @param  str  the string to be found within the phrase.
     * @param  n  the nth occurrance of the string.
     * @return  index of the nth occurrence of a string.
     */
    
    public int findNthOccurrence(String str, int n)
    {
        
        int pos = 0;
        int i = 0;
        
        while (i < n) {
            pos = currentPhrase.indexOf(str, pos+1);
            i++;
        }
        
        return currentPhrase.indexOf(str, pos);
        
    }
    
    /**
     * Replaces the Nth occurrence of a sting.
     *
     * @param  str  the string to be found within the phrase.
     * @param  n  the nth occurrance of the string.
     * @param  repl  the string you want to replace str with.
     * @return  index of the nth occurrence of a string.
     */
    
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
    
    /**
     * Finds the last occurrence of a sting.
     *
     * @param  str  the string to be found within the phrase.
     * @return  index of the last occurrence of a string.
     */
    
    public int findLastOccurrence(String str)
    {
        int count = 1;
        
        while (findNthOccurrence(str, count+1) != -1) {
            
            count++;
            
        }
        
        return findNthOccurrence(str, count);
    }
    
    /**
     * Prints the phrase of the object.
     *
     * @return  the string currentPhrase.
     */
    
    public String toString() {
        
        return currentPhrase;
        
    }
    
}
