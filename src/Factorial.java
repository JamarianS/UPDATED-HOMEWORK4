/**
 * class: Factorial
 *@author: Jah St.Aimee
 * @date: March 14, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  program should  calculate and print the factorial of the user provided value.
 */

import java.util.Scanner;
public class Factorial {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        int factorial = 1;

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if(num < 0)
            System.out.println("Cant do the factorial of a negative intger");
        else if (num <= 1)
            System.out.printf("%d!= %d", num,factorial);
        else{
            for(int counter = num; counter >= 2; counter --){
                factorial = factorial * counter;
            }
           System.out.printf("%d! = %d",num,factorial);
        }


    }
}
