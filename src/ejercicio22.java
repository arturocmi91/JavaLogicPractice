import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        //Calculo del Numero Pi

        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos terminos de precision desea: ");
        int n = sc.nextInt();

        //proceso


        System.out.println("π = " + pi(n));
    }

    public static double pi(int n) {
        int d = 1, sig = 1;
        double t, s = 0;
        for (int i = 1; i <= n; i++) {
            t = (double) 1 / d * sig;
            s += t;
            d += 2;
            sig *= -1;

        }
        return  s*4;
    }


}
