/**
 * class: StudentGrades
 * @author: ITEC 2140 students
 * @date: February 27, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  program that prompts the user for student grades, calculates and displays the average grade in the class.
 */
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        int TotalScore = 0;
        int numTest = 0;

        System.out.println("Enter one test score: " );
        int answer = input.nextInt();



        while(answer >= 0){
            System.out.println("Enter another test score, Enter -1 to stop entering" );
            answer = input.nextInt();

            TotalScore += answer;
            numTest ++;



        }
        System.out.println(TotalScore/numTest);
    }
}

