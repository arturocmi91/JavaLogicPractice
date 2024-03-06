import java.util.Scanner;

public class ejercicio34 {
    public static void main(String[] args) {

        //Reloj de Arena

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Orden de la Matriz: ");

        int n = sc.nextInt();

        //Proceso

        //Definimos matriz

        int m[][] = new int[n][n];

        //Llenamos la matriz m
        System.out.println("MATRIZ COMPLETA");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (i * 2) + j;
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        //Declaramos matriz auxiliar

        String a[][] = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = "";

            }
        }

        //Llenamos la matriz con la forma de un reloj

        int x = (n / 2) + 1;
        for (int i = 0; i < x; i++) {
            for (int j = i; j < n - i; j++) {

               //Llena la parte superior del reloj
                a[i][j]=""+ m[i][j];
                //Llena la parte inferior del reloj
                a[n-i-1][j]=""+ m[i][j];
            }
        }

        //Imprimimos las matriz resultante

        System.out.println("RELOJ DE ARENA");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
