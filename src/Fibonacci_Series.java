import java.util.Scanner;

public class Fibonacci_Series {

    //a series of numbers in which each number ( Fibonacci number )
    // is the sum of the two preceding numbers. The simplest is the series 0, 1, 1, 2, 3, 5, 8, etc.
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter no = ");
        int f_num = scanner.nextInt();
        int i;
        //intialising a=0, b=1, because first two number is 0 1
        int a =0,b=1;
        int c;
        // i strats from 2
        for (i = 2; i <= f_num; i++)
        {
            // adition of a and b
            c = a+b;
            // swap values for next number addition
            a=b;
            b=c;
           // print vertically
            // System.out.println("Fibonacci series :" + c);

            //print horizonatali
            System.out.print(c + ",");


        }

    }
}
