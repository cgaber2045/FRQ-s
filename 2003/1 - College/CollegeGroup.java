
/**
 * Write a description of class CollegeGroup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class CollegeGroup
{
    private College[] myColleges;
    
    /**
     * Constructor for the CollegeGroup.
     */
    
    public CollegeGroup(College[] myColleges) {
        
        this.myColleges = myColleges;
        
    }
    
    /**
     * Sets the tuition of a college to a new one.
     *
     * @param  collegeName  name of the college.
     * @param  newTuition  the new value of tuition.
     */
    
    public void updateTuition(String collegeName, int newTuition)
    {
        
        for (int i = 0; i < myColleges.length; i++) {
            
            if(collegeName.equals(myColleges[i].getName())) {
                myColleges[i].setTuition(newTuition);
            }
            
        }
        
    }
    
    /**
     * Sets the tuition of a college to a new one.
     *
     * @param  region  the region of the college.
     * @param  low  the lowest cost of tuition.
     * @param  high  the highest cost of tuition.
     * @return result  the array result which contains a list of colleges.
     */
    
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