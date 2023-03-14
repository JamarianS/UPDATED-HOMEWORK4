/**
 * class: GreaterString
 *@author: Jah St.Aimee
 * @date: March 14, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  program that  display if string 1 is greater in length than string 2. The program should also display if string 1 appears after string 2 in the lexicographic order or vice versa or if they are the same
 */

import java.util.Scanner;
public class GreaterString {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String sentence = input.nextLine();

        System.out.println("Enter another string: ");
        String sentence2 = input.nextLine();

        int result = sentence.compareTo(sentence2);

        if (result < 0)
        {
            System.out.println(sentence +
                    " is shorter than " + sentence2 );
        }
        else if (result == 0)
        {
            System.out.println( sentence +
                    " is equal to " + sentence2 );
        }
        else
        {
            System.out.println(sentence +
                    " is longer than " + sentence2);
        }


        if (result < 0)
        {
            System.out.println(sentence +
                    " appears after " + sentence2 + " in lexicographic order");
        }
        else if (result == 0)
        {
            System.out.println( sentence +
                    " is equal to " + sentence2 );
        }
        else
        {
            System.out.println(sentence2 +
                    " appears before " + sentence+ " in lexicographic order" );
        }

        System.out.println("The new sentence is: " + sentence + " " + sentence2);




    }
}
