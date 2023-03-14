/**
 * class: MinMaxGrade
 * @author: Jah St.Aimee
 * @date: March 14, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description: program that prompts the user for student grades and displays the highest and lowest grades in the class. The user should enter a character to stop providing values.
 */

import java.util.Scanner;
public class MinMaxGrade {
    public static void main(String[]arg){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter as many integers as you like to stop entering enter in anything but an integer");

         int max = 0;
         int min = 0;

         while(input.hasNextInt()){
             int value = input.nextInt();
             if(value > max){
                 max = value;
             }
             if(value < min ){
                 min = value;
             }
             System.out.println("The maximum value is " + max);
             System.out.println("The minimum value is " + min);
         }
    }
}
