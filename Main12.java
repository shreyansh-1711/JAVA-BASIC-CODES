import java.io.*;  
class Main12
{  
 void demo() throws IOException
{  
  System.out.println("Throws keyword used to declare multiple exception");  
}   
}  
class Use_Thows
{  
public static void main(String args[])throws IOException
{//declare exception  
     Main m=new Main();  
    m.demo();  
  
    System.out.println("normal flow...");  
  }  
}