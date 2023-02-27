/**
 * class: SumDigits
 * @author: ITEC 2140 students
 * @date: February 27, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description: program that accepts an integer from the user and displays the sum of the digits of the provided integer.
 */
import java.util.Scanner;
public class SumDigits {
    public static void main(String[]arg){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer");
        int num = input.nextInt();

        while(num > 0){
            sum = sum + num % 10;
            num = num / 10;

        }
        System.out.println(sum);
    }
}

