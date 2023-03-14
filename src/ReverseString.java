/**
 * class: ReverseString
 *@author: Jah St.Aimee
 * @date: March 14, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  program that accepts a String value from the user and displays the reverse of that value.
 */

import java.util.Scanner;
public class ReverseString {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an string: ");
        String value = input.nextLine();

        StringBuffer sb = new StringBuffer(value);
        sb.reverse();
        System.out.println(sb);
    }
}