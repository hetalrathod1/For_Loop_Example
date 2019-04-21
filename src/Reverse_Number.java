import java.util.Scanner;

public class Reverse_Number {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no = ");
        int number = scanner.nextInt();
        int i=0;
        int a =0;
        // loop continue until user enter no and stop
        while (i<=number) {

            // user input number modular division so last digit separate
             a=number%10;

           //print a value  so one number seperate
            System.out.print(a);

            // user input diveded by 10 and 'a' is int so last digit omit
            number=number/10;
            // while loop condition
            i++;
        }

    }

}
