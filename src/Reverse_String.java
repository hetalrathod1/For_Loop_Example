public class Reverse_String
{
    public static void main (String args[])
    {
        String name = "abcdef";
        // string ending null value omit with -1
        int  b =  (name.length()-1);
        System.out.println("lenth of char = "+ b);
        int i;
        // reverse loop to print each char
        for (i=b; i>=0; i--)
        {
            System.out.println("String reverse = "+name.charAt(i));
        }
    }
}
