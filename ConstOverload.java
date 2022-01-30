//Constructor Overloading

class Constructor {
    String n;
    int rollno, a;

    Constructor(String name, int id) {
        n = name;
        rollno = id;

    }

    Constructor(String name, int id, int age) {
        n = name;
        rollno = id;
        a = age;

    }

    void display() {
        System.out.println("Name:" + "\t" + n);
        System.out.println("RollNo:" + "\t" + rollno);
        System.out.println("Age:" + "\t" + a);

    }

}

public class ConstOverload {
    public static void main(String args[]) {
        Constructor con = new Constructor("Edmond", 01);
        Constructor con1 = new Constructor("Jonathan", 02, 19);
        con.display();
        System.out.println();
        con1.display();

    }
}