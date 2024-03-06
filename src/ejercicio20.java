import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        //contador de primos
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos numeros primos desean: ");
        int n = sc.nextInt();

        int countPrim = 0, i = 2, s = 0;

        //Calculos
        while (countPrim < n) {
            if(elNumeroEsPrimo(i)){
                System.out.print(i+"\t");
                countPrim++;
                s+=i;
            }
            i++;
        }
        System.out.println("\n La suma es : " +s);
        System.out.println("\n el promedio es : " + (s/n));

    }

    public static boolean elNumeroEsPrimo(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
