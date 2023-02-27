
import java.util.Scanner;
public class PrimeNum {
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
