
/**
 * Write a description of class SelfDivisorTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class SelfDivisorTester
{
    public static void main(String[] args)
       {
           SelfDivisor r1 = new SelfDivisor();
            System.out.println(r1.isSelfDivisor(128));
            System.out.println(Arrays.toString(r1.firstNumSelfDivisors(10, 3)));
       }

}
