import java.util.Scanner;

public class Digit_Sum
{
    public static void main (String args [])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five digit = ");
        int digit = scanner.nextInt();

        int i , a=0;
        int sum=0;
       for (i=1; i<=5; i++)
       {
        //user enter digit  modular division
           a=digit%10;
           // modular division a + sum =0 first time then loop continue
            sum = sum+a;
            // user input digit divided by 10
            digit=digit/10;
       }

       // System.out.println(a);
        System.out.println(sum);
        //System.out.println(digit);
    }
}
