import java.util.Scanner;

public class R2Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int f = 0, s = 1;
//{0,1,1,2,3,5,8.....}

        for (int i = 0; i < n; i++) {

            System.out.print("\t"+ f + "\t");

            int fib = f + s;
            f = s;
            s = fib;



        }
    }
}
