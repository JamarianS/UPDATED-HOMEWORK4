/**
 * class: PrimeNum
 * @author: ITEC 2140 students
 * @date: February 27, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description: program that prompts the user for an integer and displays if the provided integer is a prime number or not.
 */
import java.util.Scanner;
public class PrimeNum2 {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:  ");
        int number = input.nextInt();

        int i = 1;
        boolean prime = true;

        while(number > i){
            if(number % i == 0 ){
                prime = false;
                //System.out.println(number + " is a prime number ");
            }
            i +=1;

        }
        if(prime){
            System.out.println("the number is prime");
        }else{
            System.out.println("the number isnt prime");
        }
    }
}
