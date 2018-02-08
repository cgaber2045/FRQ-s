
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class Tester
{
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
        
        ArrayList<StudentAnswerSheet> sheets = new ArrayList<StudentAnswerSheet>();
        sheets.add(r1);
        
        TestResults results = new TestResults(sheets);
        System.out.println(r1.getScore(key));
        System.out.println(results.highestScoringStudent(key));

    }
}
