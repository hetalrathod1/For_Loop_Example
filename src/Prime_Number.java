import java.util.Scanner;

public class Prime_Number
{
    //Prime number is a number that is greater than 1 and divided by 1 or itself only.
    // In other words, prime numbers can't be divided by other numbers than itself or 1.
    // For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter prime number  = ");
        int number = scanner.nextInt();

        boolean c=true;
        int i;
        // prime number greater than 1 so i =2
       // number/2 because user enter 7 then loop will only  3.5 time count(because i is int so 5 will omit so loop run for 3 time
        for (i=2; i<=number/2; i++)
        {
            // user input number % i . modular division compare with 0 to check number divided by itself
            if (number%i==0)
            {
             c=false;
            }
            else {
                c=true;
            }

        }
        if (c)
        {
            // if c true then prime number
            System.out.println(" Prime number");
        }
        else
        {
            // c false
            System.out.println(" not  Prime number");
        }
    }



}

