/**
 * class: Fibonacci
 *@author: Jah St.Aimee
 * @date: March 14, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  program
 */

public class Fibonacci {
    public static void main(String[]arg){
        int a = 0, b = 1, c, i = 0, n = 30;
        System.out.print("The first 30 terms of the Fibonacci sequence are: ");

        while (i < n) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }

    }
}


