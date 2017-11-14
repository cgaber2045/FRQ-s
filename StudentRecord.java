
/**
 * Write a description of class StudentRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRecord
{
   public int[] scores;
   
   public StudentRecord(int[] scores) {
       this.scores = scores;
   }

   private double average(int first, int last) {
       double sum = 0;
       for (int i = first; i <= last; i++) {
          sum += scores[i]; 
       }
       return sum / (last+1 - first);
   }
    
   private boolean hasImproved() {
       for (int i = 1; i < scores.length; i++) {
           if (scores[i-1] > scores[i]) return false;
        }
        return true;
   }
    
   public double finalAverage() {
       int first = 0;
       int last = scores.length-1;
       if(hasImproved()) {
           first = scores.length/2;
        }
       return average(first, last);
    }
    
}
