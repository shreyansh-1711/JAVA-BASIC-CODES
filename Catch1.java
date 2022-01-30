import java.io.*;

class Catch1
{
    public static void main(String args[])
    {
        int a,d;
        try // monitor the code
        {
            d=0;
            a=42/d;
            System.out.println("this will not be printed");
        }

        catch(ArithmeticException e)// divide-by-zero- error
        {
            System.out.println("Division by zero");
        }

        System.out.println("after catch statement");
    }
}