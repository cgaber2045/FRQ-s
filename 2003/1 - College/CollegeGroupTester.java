
/**
 * Write a description of class CollegeGroupTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class CollegeGroupTester
{
    
     public static void main(String[] args)
       {
            College c1 = new College("ColgateUniversity", "Northeast", 27025);
            College c2 = new College("DukeUniversity", "Southeast", 26000);
            College c3 = new College("KalamazooCollege", "Midwest", 19764);
            College c4 = new College("StanfordUniversity", "West", 25917);
            College c5 = new College("FloridaInternationalUniversity", "Southeast", 10800);
            College c6 = new College("DartmouthCollege", "Northeast", 27764);
            College c7 = new College("SpelmanCollege", "Southeast", 11455);
            
            College[] myColleges = {c1, c2, c3, c4, c5, c6, c7};
            CollegeGroup colleges = new CollegeGroup(myColleges);

            College[] matches = colleges.getCollegeList("Southeast", 10000, 20000);
            
            for (int i = 0; i < matches.length; i++) {
                System.out.println(matches[i]);
            }
            
            System.out.println(c1);            
            colleges.updateTuition("ColgateUniversity", 27500);
            System.out.println(c1);
            
       }
}