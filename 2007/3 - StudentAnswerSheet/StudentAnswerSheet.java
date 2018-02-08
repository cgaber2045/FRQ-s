
/**
 * Write a description of class StudentAnswerSheet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class StudentAnswerSheet
{
    // instance variables
    private ArrayList<String> answers;
    private String name;
    
    /**
     * Constructor for objects of class StudentAnswerSheet
     */
    public StudentAnswerSheet(String name, ArrayList<String> answers)
    {
        
        this.name = name;
        this.answers = answers;
        
    }

    /**
     * Gets the scores of the student
     *
     * @param  key  the list of correct answers, represented as strings of length one
     * @return this student's test score
     */
    public double getScore(ArrayList<String> key)
    {
        
        double score = 0;
        
        for (int i = 0; i < key.size(); i++) {
            
            if (key.get(i).equals(answers.get(i))) score++;
            else if (!"?".equals(answers.get(i))) score -= 0.25;
            
        }
        
        return score;
    }
    
    /**
     * @return the name of the student
     */
    public String getName() {
        
        return name;
        
    }
}
