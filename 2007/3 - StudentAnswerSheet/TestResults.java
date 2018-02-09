
/**
 * Write a description of class TestResults here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class TestResults
{
    private ArrayList<StudentAnswerSheet> sheets;

    /**
     * Constructor for objects of class StudentAnswerSheet
     */
    
    public TestResults(ArrayList<StudentAnswerSheet> sheets) {
        
        this.sheets = sheets;
        
    }
    
    /**
     * Returns the name of a student with the highest score. 
     *
     * @param  key the list of correct answers represented as strings of length one
     * @return the name of the student with the highest score
     */
    
    public String highestScoringStudent(ArrayList<String> key)
    {
        
        String name = "";
        double score = Integer.MIN_VALUE;
        
        for (StudentAnswerSheet x : sheets) {
            
            if (x.getScore(key) > score) {
                
                score = x.getScore(key);
                name = x.getName();
                
            }
            
        }
        
        return name;
        
    }
}
