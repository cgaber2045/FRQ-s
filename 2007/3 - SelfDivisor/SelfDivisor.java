
/**
 * Write a description of class SelfDivisor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelfDivisor
{
    /**
     * Returns true if number is a self divisor.
     *
     * @param  number  integer that needs to be checked.
     * @return    true or false based on if number is self divisor.
     */    
    public static boolean isSelfDivisor(int number)
    {
        while (number > 0) {
            int digit = number % 10;
            if (digit == 0 || number % digit != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
    
    /**
     * Finds the first "n" self divisors given a start point.
     *
     * @param  start the number to start looking for self divisors.
     * @param  num the number of self divisors to be returned.
     * @return    the array of numbers which met the criteria.
     */   
    public static int[] firstNumSelfDivisors(int start, int num) {
        int divisorFound = 0;
        int[] result = new int[num];
     
        while (divisorFound < num) {
            if (isSelfDivisor(start)) {
                result[divisorFound] = start;
                divisorFound++;
            }
            start++;
        }
     
        return result;
    }
}
