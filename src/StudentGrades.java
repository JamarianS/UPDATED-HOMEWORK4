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

