//abstract class
abstract class Head
{
    void print()
    {
        System.out.println("Shreyansh is Abstract class");        
    }
    abstract void show();
}

class Worker extends Head
{
    void show()
    {
        System.out.println("This is abstract method of abstract class");
    }
    
}

class abstractt
{
    public static void main(String args[])
    {
        Worker c=new Worker();
        c.print();
        c.show();    
    }
}