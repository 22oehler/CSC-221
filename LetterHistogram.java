import java.util.Arrays;

/** 
 * A program for tallying the number of times various letters appear in a given
 * string.
 * time spent = 1 hour
 * @author Lars Oehler
 */

public class LetterHistogram {

    /** Tester method */
    public static void main(String[] args) {
        // Aside: unfortunately, printing arrays in Java is a little long-
        // winded. Simply saying System.out.println(buildLetterHistogram("abc")) 
        // will not produce the output we desire (go ahead, try it if you 
        // like!). To obtain more human-friendly output, we have to use the 
        // Arrays.toString method that produces a string representation of an 
        // array that is more suitable for printing, as you can see below.
        System.out.println(Arrays.toString(buildLetterHistogram("abcxyz")));
        System.out.println(Arrays.toString(buildLetterHistogram("ABCxyz")));
        System.out.println(Arrays.toString(buildLetterHistogram("FooBar?!")));
        System.out.println(Arrays.toString(buildLetterHistogram("")));
        System.out.println(Arrays.toString(buildLetterHistogram("0123456789")));
        System.out.println(Arrays.toString(
        buildLetterHistogram("The quick (brown) Fox jumps over " + 
                                 "the lazy Dog.")));
    }

    /** Returns a histogram of letter frequencies in the given text.
     * 
     * @param text the string whose letter frequencies we wish to tally
     * @return an integer array of length 26, where each entry corresponds to
     * the number of times that letter appeared in the string (number of 'a's 
     * at index 0, number of 'b's at index 1, etc.)
     */
    public static int[] buildLetterHistogram(String text) {
        text = text.toLowerCase();
        int[] alpha = new int[26];
        char[] abz = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] t = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            t[i] = text.charAt(i);
        }
        for (int te = 0; te < text.length(); te++) {
            for (int i = 0; i < 26; i++) {
                if (abz[i] == t[te]) {
                    alpha[i] += 1;
                }
            }
        }
        return alpha;
    }
}
