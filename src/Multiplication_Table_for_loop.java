import java.util.Scanner;

public class Multiplication_Table_for_loop
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter table no: ");
        int table = scanner.nextInt();
        int i;

        // loop for 1 to 10
        for (i=1; i<=10; i++)
        {
            // print table by user input
            System.out.println(table+" * "+i+" = "+(table*i));
        }
     }
}
