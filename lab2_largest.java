//checks for largest of three numbers using command line interface (WILL ONLY WORK ON CMD)
class lab2_largest {

    public static void main(String[] args) {

        int n1,n2,n3;
        n1=Integer.parseInt(args[0]);
        n2=Integer.parseInt(args[1]);
        n3=Integer.parseInt(args[2]);


        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}