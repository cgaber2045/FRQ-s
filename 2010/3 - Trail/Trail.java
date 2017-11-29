
/**
 * Write a description of class Trail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trail
{
    // instance variables - replace the example below with your own
    private int[] markers;

    /**
     * Constructor for objects of class Trail
     * @param markers  int array with all the markers.
     */
    
    public Trail(int[] markers)
    {
        
        this.markers = markers;
        
    }

    /**
     * Checks to see if a Trail Segment is level.
     *
     * @param  start  where to start index in array.
     * @param  end  where to end index in array.
     * @return    true or false based on whether the trail segment is level or not.
     */
    
    public boolean isLevelTrailSegment(int start, int end)
    {
        
        int maxElevation = Integer.MIN_VALUE;
        int minElevation = Integer.MAX_VALUE;
        
        for (int i = start; i <= end; i++) {
            
            maxElevation = Math.max(markers[i], maxElevation);
            minElevation = Math.min(markers[i], maxElevation);
            
        }
        
        return maxElevation - minElevation <= 10;
        
    }
    
    /**
     * Checks to see if a Trail Segment is difficult.
     * @return    true or false based on whether the trail segment is difficult or not.
     */
    
    public boolean isDifficult()
    {
        
        int change30Elevation = 0;
        
        for (int i = 1; i < markers.length; i++) {
            if (Math.abs(markers[i-1] - markers[i]) >= 30) {
                change30Elevation++;
            }
        }
        
        return change30Elevation >= 3;
        
    }
}
