import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        //Ejercicio 1   Vector

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de posiciones : ");
        int n = sc.nextInt();

        int vec[] = new int[n];
        int s = 0;
        double avg = 0;
        for (int i = 0; i < n; i++) {

            vec[i] = (i + 1) * i;


            s += vec[i];

            avg = s / n;

            System.out.println("vec " + i + " = " + vec[i]);


        }
        System.out.println("La suma  es = " + s);
        System.out.println("El promedio es  = " + avg);

    }

}
