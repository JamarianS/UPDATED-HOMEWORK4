/**
 * class: Pattern
 *@author: Jah St.Aimee
 * @date: March 14, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  program that prints a pattern of *
 */

public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = 1; j <= 6 + 1 - i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}







