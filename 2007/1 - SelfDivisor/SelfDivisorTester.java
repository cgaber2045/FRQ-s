
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
            System.out.println(SelfDivisor.isSelfDivisor(128));
            System.out.println(Arrays.toString(SelfDivisor.firstNumSelfDivisors(10, 3)));
       }

}
