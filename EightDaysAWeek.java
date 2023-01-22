/**
Program that prints the lyrics to Eight Days a Week by the Beatles.

@author Lars Oehler
*/
public class EightDaysAWeek {

    /** Tester method */
    public static void main(String[] args) {
        printEightDaysAWeek();
    }

    public static void EiDAW() {
        System.out.println("Eight days a week");
    }

    public static void repeatedLines1() {
        System.out.println("Hold me, love me, hold me, love me");
        System.out.println("Ain't got nothing but love babe");
        EiDAW();
    }

    public static void verse14() {
        System.out.println("Ooh I need your love babe");
        System.out.println("Guess you know it's true");
        System.out.println("Hope you need my love babe");
        System.out.println("Just like I need you");
        repeatedLines1();
    }

    public static void verse2() {
        System.out.println("Love you every day girl");
        System.out.println("Always on my mind");
        System.out.println("One thing I can say girl");
        System.out.println("Love you all the time");
        repeatedLines1();
    }

    public static void verse35() {
        EiDAW();
        System.out.println("I love you");
        EiDAW();
        System.out.println("Is not enough to show I care");
    }

    public static void verse6() {
        verse2();
        EiDAW();
        EiDAW();
    }

    /** Prints the complete lyrics to Eight Days a Week */
    public static void printEightDaysAWeek() {
        verse14();
        System.out.println();
        verse2();
        System.out.println();
        verse35();
        System.out.println();
        verse14();
        System.out.println();
        verse35();
        System.out.println();
        verse6();
    }

}