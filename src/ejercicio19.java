import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        //buscar numero si es primo

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int n = sc.nextInt();

        //Calculos

        if(elNumeroEsPrimo(n)){
            System.out.println("El numero " +n+ " es primo");
        }else{
            System.out.println("El numero " +n+ " no es primo");
        }

    }


   public static boolean elNumeroEsPrimo(int n) {

        for (int i = 2; i <= n/2; i++) {
            if (n % i== 0) {
                return false;
            }

        }
        return true;
    }
}
