//Method Overloading (using sum of integers) most probably lab3

class MethodOverload {
    void sum(int a, int b) {
        a = a + b;
        System.out.println("First sum: " + a);
    }

    int sum(int x, int y, int z) {
        x = x + y + z;
        return x;
    }
}

 public class MethOverloading {
    public static void main(String args[]) {
        MethodOverload meth = new MethodOverload();
        meth.sum(10, 20);
        int m = meth.sum(30, 40, 50);
        System.out.println("Second sum: " + m);
    }
}