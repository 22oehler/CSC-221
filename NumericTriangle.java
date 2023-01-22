/**
Program that prints an ASCII numeric triangle.

@author lars oehler
*/
public class NumericTriangle {

    /** Draws a numeric triangle
      * @param height The height of the triangle to draw.
    */
    public static void drawNumericTriangle(int height) {


        for (int i = 1; i <= height; i++) {
            for (int spa = 0; spa < height - i; spa++) {
                System.out.print(" ");
            }
            for (int num = 0; num < i; num++) {
                System.out.print(i);
            }
            System.out.println();;
        }
    }

    /** Tester method */
    public static void main(String[] args) {
        drawNumericTriangle(5);
    }
}
