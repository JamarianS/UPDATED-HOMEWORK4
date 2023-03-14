/**
 * class: LastIndexOf
 *@author: Jah St.Aimee
 * @date: March 14, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  The program should then find the last occurrence of the provided character in the provided String and display the corresponding index.
 */
import java.util.Scanner;
public class LastIndexOf {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = input.nextLine();

        System.out.println("Enter a character value to find the last occurence of: ");
        String character = input.nextLine();

        System.out.println(str.lastIndexOf(character));

        if(str.contains(character)){
            System.out.println("The last occurrence of character " + character + " is at ");
        }else{
            System.out.println("The last occurrence of character " + character + "is at index -1 ");
        }


        }

    }




