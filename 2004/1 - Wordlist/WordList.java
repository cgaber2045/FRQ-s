
/**
 * Write a description of class WordList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class WordList
{
    // instance variable
    private ArrayList<String> myList;

    /**
     * Constructor for objects of class WordList
     * 
     * @param myList list of words
     */
    
    public WordList(ArrayList<String> myList)
    {
        
        this.myList = myList;
        
    }

    /**
     * Counts the number of words with a certain length
     *
     * @param  len  the length of the string in the list
     * @return  count  the count of words of a certain length
     */
    
    public int numWordsOfLength(int len)
    {
        
        int count = 0;
        
        for (String x: myList) {
            
            if (x.length() == len) count++;
            
        }
        
        return count;
        
    }
    
    /**
     * Removes the all words with a certain length from the list
     *
     * @param  len  the length of a string in the list
     */
    
    public void removeWordsOfLength(int len) {
        
        for (int i = myList.size()-1; i >= 0; i--) {
            
            if ((myList.get(i)).length() == len) {
                
                myList.remove(i);
                
            }
            
        }
    }
    
    /**
     * Converts to String.
     *
     * @return the Arraylist as a String
     */
    
    public String toString() {
        
         return myList.toString();
        
    }
    
}


