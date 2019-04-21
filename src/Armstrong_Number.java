import java.util.Scanner;

public class Armstrong_Number {

    // each digit cube and sum = digit like371 is an Armstrong number  3**3 + 7**3 + 1**3 = 371
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Armstong number = ");
        int number = scanner.nextInt();
        int a , b;
        int arm_number = 0;
        int i;

        b=number;

        for (i = 0; i >= 0; i++)
        {
            //division modular to seperate no (like user enter 345  so  modular division is 5)
            a = number % 10;
            //a( modular division), armnumber first time =0, when loop continue armnumber +modular division cube
            arm_number = arm_number + (a * a * a);
            // extract last digit from user input like 34.5, when loop continue it will 3.4
            number = number / 10;
        }
        // b store user input original no
        if(arm_number==b)
       {
        System.out.println("This number is Armstrong");
       }
       else
       {
           System.out.println("This number is not Armstrong");
       }

    }

}