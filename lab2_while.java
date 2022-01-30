//sum of 'n' integers using CMD
class lab2_while {
        public static void main(String[] args)
        {
            int n = Integer.parseInt(args[0]);
            int sum = 0, i = 1;
            while (i <= n) {   
                sum = sum + i;   
                i++;
            }
            
            System.out.println(sum);
        }
    }