
/**
 * Write a description of class Hiddenword here.
 *
 * @author Chris Gaber
 * @version 12 / 6 / 17
 */

public class HiddenWord
{

    private String puzzle;

    /**
     * Constructor for objects of class Hiddenword
     * @param puzzle The given word puzzle.
     */
    public HiddenWord(String puzzle)
    {
        
        this.puzzle = puzzle;
        
    }

    /**
     * Compares the puzzle word to the guess and finds matching or close characters.
     *
     * @param  guess  the user's guess at the word.
     * @return    the resulting string with matching and close characters.
     */
    public String getHint(String guess)
    {
        String result = "";
        
        for (int i = 0; i < guess.length(); i++) {
            
            if (guess.charAt(i) == puzzle.charAt(i)) {
                result += guess.charAt(i);
            }
            
            else if (puzzle.contains(guess.substring(i,i+1))) {
                result += "+";
            }
            
            else {
                result += "*";
            }
            
        }
        
        return result;
    }
}
