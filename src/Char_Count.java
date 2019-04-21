import java.util.Scanner;

public class Char_Count
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name = ");
        String  char_name = scanner.next();
        // char length add 0 at end so need to - from length to get correct length. hetal = char count 6
        int a=char_name.length()-1;
        // initialising count
        int count=0;
        int i;
        for (i=0; i<=a; i++)
        {
            //each char compare with a
            if (char_name.charAt(i)=='a')
            {
                // each char +1
             count=count+1;
             }
        }
        System.out.println("Total character a = "+count);
    }
}
