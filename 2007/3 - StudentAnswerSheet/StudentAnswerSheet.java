
/**
 * Write a description of class StudentAnswerSheet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class StudentAnswerSheet
{
    // instance variables - replace the example below with your own
    private ArrayList<String> answers;
    private String name;
    
    /**
     * Constructor for objects of class StudentAnswerSheet
     */
    public StudentAnswerSheet()
    {
        this.name = name;
        this.answers = answers;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getScore(ArrayList<String> key)
    {
        double score = Integer.MIN_VALUE;
        for (int i = 0; i < key.size(); i++) {
            if (key.get(i).equals(answers.get(i))) score++;
            else if (!"?".equals(answers.get(i))) score -= 0.25;
        }
        
        return score;
    }
    
    public String getName() {
        return name;
    }
}
