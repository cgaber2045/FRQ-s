
/**
 * Write a description of class CollegeGroup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class CollegeGroup
{
    public College[] myColleges;
    
    public CollegeGroup() {
        this.myColleges = new College[7];
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public void updateTuition(String collegeName, int newTuition)
    {
        for (int i = 0; i < myColleges.length; i++) {
            if(collegeName.equals(myColleges[i].getName())) {
                myColleges[i].setTuition(newTuition);
            }
        }
    }
    
    public College[] getCollegeList(String region, int low, int high)
    {
        int count = 0;
        for (int i = 0; i < myColleges.length; i++) {
            if (myColleges[i].getRegion().equals(region) &&
            myColleges[i].getTuition() >= low &&
            myColleges[i].getTuition() <= high) {
                count++;
            }
        }
        
        College[] result = new College[count];
        
        int count2 = 0;
        for (int i = 0; i < myColleges.length; i++) {
            if (myColleges[i].getRegion().equals(region) &&
            myColleges[i].getTuition() >= low &&
            myColleges[i].getTuition() <= high) {
                result[count2] = myColleges[i];
                count2++;
            }
        }
        return result;
    }
}
