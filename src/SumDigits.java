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

