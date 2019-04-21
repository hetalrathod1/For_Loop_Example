import java.util.Scanner;

public class Count_Positive_negative_Zero {
    public static void main(String args[]) {
        int pos=0;
        int neg=0;
        int zero=0;
        String ans;
        // user input scanner class in do loop because user want to enter till he wants
        do
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter number");
            int number = scanner.nextInt();

            if (number>0)
            {
                //count positive no when loop continue. first time 0 pos
               pos =pos+1;
            }
            else if (number==0)
            {
                //count zero no when loop continue. first time 0 pos

                zero=zero+1;
            }
            else if (number<0)
            {
                //count negative no when loop continue. first time 0 pos

                neg=neg+1;
            }
            // ask user to continue. because till user want to enter no
            System.out.println("Do you want to continue press yes/no?");

            // user enter yes  ans stored in ans . and loop continue
            ans=scanner.next();
        }
        // checking condition with user  ans yes/YES
        while (ans=="yes"||ans=="YES");
        {
            System.out.println("positive no = "+pos);
            System.out.println("Negative no = "+neg);
            System.out.println("Zero = "+zero);

        }

    }
}

