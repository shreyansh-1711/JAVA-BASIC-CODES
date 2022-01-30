
import java.io.*;
class IoExceptionn
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
Exp2.chk_throw();// method invoked using classname
}
}
