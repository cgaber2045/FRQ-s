
/**
 * Write a description of class TestResults here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class TestResults
{
    private ArrayList<String> sheets;

    /**
     * @param  key the list of correct answers represented as strings of length one
     * @return the name of the student with the highest score
     */
    
    public String highestScoringStudent(ArrayList<String> key)
    {
        String name = "";
        double score = Integer.MIN_VALUE;
        
        for (String x : sheets) {
            if (x.getScore(key) > score) {
                score = x.getScore(key);
                name = x.getName();
            }
            
            return name;
        }
    }
    
    public static void main(String args[]) {
        ArrayList answers = new ArrayList();
        answers.add("A");
        answers.add("B");
        answers.add("D");
        answers.add("E");
        answers.add("A");
        answers.add("C");
        answers.add("?");
        answers.add("B");
        answers.add("D");
        answers.add("C");
        
        ArrayList key = new ArrayList();
        key.add("A");
        key.add("C");
        key.add("D");
        key.add("E");
        key.add("B");
        key.add("C");
        key.add("E");
        key.add("B");
        key.add("B");
        key.add("C");
        
        StudentAnswerSheet r1 = new StudentAnswerSheet("Chris", answers);
        
        ArrayList sheets = new ArrayList();
        sheets.add(r1);
        
        System.out.println(r1.getScore(key));
        System.out.println(r1.highestScoringStudent(key));

    }
}
