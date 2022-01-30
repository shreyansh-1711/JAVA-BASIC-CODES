
import java.io.*;
class Exception_exp2
{
public static void chk_throw()
{
try
{
throw new IOException("Explicit IOException");
}
catch(IOException ne)
{
System.out.println("Exception of the  "+ne);
}
}
public static void main(String args[])
{
Exception_exp2.chk_throw();// method invoked using classname
}
}
