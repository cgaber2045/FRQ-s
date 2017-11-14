
/**
 * Write a description of class StudentRecord here.
 *
 * @author Chris Gaber
 * @version 11/13/17
 */

public class StudentRecord
{
   
   public int[] scores;
     
   /**
     * Constructor for score arrays.
     *
     * @param scores Array of test scores
     */
   
   public StudentRecord(int[] scores) {
      
      this.scores = scores;
      
   }
   
     /**
     * Calculates average of test scores
     *
     * @param first First position in the array.
     * @param last Last position in the array.
     * @return The average of the scores.
     */
   
   private double average(int first, int last) {
      
      double sum = 0;
      
      for (int i = first; i <= last; i++) {
         sum += scores[i]; 
      }
      
      return sum / (last+1 - first);
      
   }
    
     /**
     * Decides whether student has improved or not.
     *
     * @return If student has improved or not.
     */
   
   private boolean hasImproved() {
      
      for (int i = 1; i < scores.length; i++) {
         
          if (scores[i-1] > scores[i]) return false;
         
      }
      
      return true;
   }
    
     /**
     * Calculates average test score if student has improved.
     *
     * @return Average of test scores based on score improvement.
     */
   public double finalAverage() {
      
      int first = 0;
      int last = scores.length-1;
      
      if(hasImproved()) {
         
          first = scores.length/2;
         
       }
      
      return average(first, last);
    }
    
}
