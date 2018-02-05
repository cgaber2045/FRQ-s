
/**
 * Write a description of class WordList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class WordList
{
    // instance variables - replace the example below with your own
    private ArrayList<String> myList;

    /**
     * Constructor for objects of class WordList
     */
    public WordList(ArrayList<String> myList)
    {
        this.myList = myList;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int numWordsOfLength(int len)
    {
        int count = 0;
        for (String x: myList) {
            if (x.length() == len) count++;
        }
        return count;
    }
    
    public void removeWordsOfLength(int len) {
        for (int i = myList.size()-1; i >= 0; i--) {
            if ((myList.get(i)).length() == len) {
                myList.remove(i);
            }
        }
    }
}


