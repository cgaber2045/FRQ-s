
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
        ArrayList a1 = new ArrayList();
        a1.add("A");
        a1.add("B");
        a1.add("D");
        a1.add("E");
        a1.add("A");
        a1.add("C");
        a1.add("?");
        a1.add("B");
        a1.add("D");
        a1.add("C");
        
        ArrayList a2 = new ArrayList();
        a2.add("A");
        a2.add("A");
        a2.add("A");
        a2.add("A");
        a2.add("A");
        a2.add("A");
        a2.add("A");
        a2.add("A");
        a2.add("A");
        a2.add("A");
        
        ArrayList a3 = new ArrayList();
        a3.add("A");
        a3.add("C");
        a3.add("D");
        a3.add("E");
        a3.add("B");
        a3.add("C");
        a3.add("E");
        a3.add("B");
        a3.add("B");
        a3.add("C");
        
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
        
        StudentAnswerSheet r1 = new StudentAnswerSheet("Chris", a1);
        StudentAnswerSheet r2 = new StudentAnswerSheet("Jake", a2);
        StudentAnswerSheet r3 = new StudentAnswerSheet("Memes", a3);
        
        ArrayList<StudentAnswerSheet> sheets = new ArrayList<StudentAnswerSheet>();
        sheets.add(r1);
        sheets.add(r2);
        sheets.add(r3);
        
        TestResults results = new TestResults(sheets);
        
        System.out.println(r1.getScore(key));
        System.out.println(r2.getScore(key));
        System.out.println(r3.getScore(key));
        
        System.out.println(results.highestScoringStudent(key));

    }
}
