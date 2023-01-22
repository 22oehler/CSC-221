public class MostSignificant {
    /**
 * Program that determines the leading digit in a given integer.
 * time spent = 30 minutes
 * @Lars Oehler 
 */
    /** Tester method */
public static void main(String[] args) {
    System.out.println(getMostSignificantDigit(247));   // 2
    System.out.println(getMostSignificantDigit(0));     // 0
    System.out.println(getMostSignificantDigit(-903));  // 9
    System.out.println(getMostSignificantDigit(5));     // 5
}

    /**
     * Returns the most-significant digit (MSD) in a given integer.
     * 
     * @param num the number whose MSD we wish to extract
     * @return the MSD of num
     */
    public static int getMostSignificantDigit(int num) {
        while (num > 10 || num < -10) {
            num /= 10;
        }

        return num;
    }

}

