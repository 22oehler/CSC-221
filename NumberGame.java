/**
Program that prints the results of a number game.
time spent = 15 minutes
@author lars oehler
*/
public class NumberGame {

    /** Determines whether integers a and b can be combined to produce c.
      *
      * The inputs a and b can be combined using the four fundamental
      * arithmetic operators --- +, -, * and / --- in any order. The goal is
      * to determine whether the result c can be produced by doing so.
      *
      * @param a the first input operand
      * @param b the second input operand
      * @param c the desired integer result
      * @return true if and only if a and b can be combined to produce the
      * result c in some way.
     */
    public static boolean isPossible(int a, int b, int c) {
        double A = a;
        if (a + b == c) {
            return true;
        }
        else if (a - b == c || b - a == c) {
            return true;
        }
        else if (a * b == c) {
            return true;
        }
        else if (A / b == c || b / A == c) {
            return true;
        }
        return false;  // placeholder to ensure compilation, modify as needed
    }

    /** Tester method */
    public static void main(String[] args) {
        System.out.println(isPossible(1, 2, 3));    // true
        System.out.println(isPossible(2, 24, 12));  // true
        System.out.println(isPossible(5, 3, 1));    // false
        System.out.println(isPossible(9, 16, 7));   // true
        System.out.println(isPossible(7, 2, 14));   // true
        System.out.println(isPossible(12, 4, 2));   // false
    }
}