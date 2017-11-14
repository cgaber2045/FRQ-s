
/**
 * Write a description of class StudentRecordTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRecordTester
{
   
   public static void main(String[] args)
   {
        int[] scoresa = {50, 50, 20, 80, 53};
        StudentRecord r1 = new StudentRecord(scoresa);
        
        int[] scoresb = {20, 50, 50, 53, 80};
        StudentRecord r2 = new StudentRecord(scoresb);
        
        int[] scoresc = {20, 50, 50, 80};
        StudentRecord r3 = new StudentRecord(scoresc);
        
        System.out.println(r1.finalAverage());
        System.out.println(r2.finalAverage());
        System.out.println(r3.finalAverage());
   }
}
