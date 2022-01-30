//outputs sum of 2 integers using command line interface (WILL ONLY WORK ON CMD)
class lab2_sum {
    public static void main(String[] args) {

        int x, y, z;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);

        z = x + y;
        System.out.println("the sum is " + z);
    }
}