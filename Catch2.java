import java.io.*;

class Catch2
{
    public static void chk_throw()
    {
        try
        {
            // create object of IOException
            throw new IOException("Explicit IOException");
        }
        catch(IOException ne)
        {
            System.out.println("Exception is "+ne);
        }
    }
    public static void main(String args[])
    {
        catch2.chk_throw();// method invoked using classname
    }
}