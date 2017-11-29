
/**
 * Write a description of class TrailTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TrailTester
{
   public static void main(String[] args)
   {
        int[] traila = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
        Trail r1 = new Trail(traila);
        
        int[] trailb = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
        Trail r2 = new Trail(trailb);
        
        System.out.println(r1.isLevelTrailSegment(4, 5));
        System.out.println(r2.isDifficult());
   }

}
