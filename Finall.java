class Finall
{
public static void main(String args[])
{

int input , result;

try
{
input = 5;
result = input/0;
System.out.println("Division of " +input + "is" +result);
}

catch(ArithmeticException a)
{
a.printStackTrace();
}

catch(Exception e)
{
e.printStackTrace();
}
}
}
