public class Multiple_Table_Multiplication
{
    public static void main(String args[])
    {
        int table1=1;
        int table2=2;
        int table3=3;
        int table4=4;

        int i;
        for (i=1; i<=10; i++)
        {
            System.out.print(table1 +  " * " + i + " = " + (table1*i));
            //"\t" meaning for gap , work as a tab in keyboard so one table after gap n then next table print
            System.out.print("\t\t"+table2 +  " * " + i + " = " + (table2*i));
            System.out.print("\t\t"+table3 +  " * " + i + " = " + (table3*i));
            System.out.print("\t\t"+table4 +  " * " + i + " = " + (table4*i));

            //  afeter each table line enter
            System.out.println();

        }

    }
}
