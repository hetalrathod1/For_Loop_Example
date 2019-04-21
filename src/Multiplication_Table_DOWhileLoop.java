import java.util.Scanner;

public class Multiplication_Table_DOWhileLoop
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter table no : ");
        int table = scanner.nextInt();
        int i=1;

        do {
            // will print i value
            System.out.println(table + " * "+i+" = "+ (table*i));

            // i value incriment by 1
            i++;
        }
        // print until <=10 satisfied
        while (i<=10);
    }
}
