import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
        //Ejercicio 1   Vector

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de posiciones : ");
        int n = sc.nextInt();

        int vec[] = new int[n];
        int s = 0, p = 1;

        for (int i = 0; i < n; i++) {

            if (esPar(i)) {
                vec[i] = i + 7;

            } else {
                vec[i] = i - 1;

            }

            if (esPar(vec[i])) {
                s += vec[i];
            } else {
                p *= vec[i];
            }
            System.out.println("vec " + i + " = " + vec[i]);


        }
        System.out.println("La suma de los valores pares es =" + s);
        System.out.println("El producto de los valores impares es = " + p);

    }

    public static boolean esPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
