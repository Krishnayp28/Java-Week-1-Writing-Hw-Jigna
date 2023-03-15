package java_week1_homework;

/**
 * 9. write a java program to print the result of the following operations.
 * Test Data :
 * a. -5 + 8 * 6
 * b. (55 +9) % 9
 * c. 5 + 15 / 3 * 2 - 8 % 3
 * Expected output :
 * 43
 * 1
 * 19
 * 13
 */
public class Programme9_MixedOperations {
    public static void main(String[] args) {
        // Mixed operation declaration
        int a = -5 +8 * 6 ;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5/8;
        int d = 5 + 15 / 3 * 2 -8 % 3;
        // output
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
