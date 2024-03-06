import java.util.Scanner;

public class ejercicio31 {
    public static void main(String[] args) {
        //Operaciones en una matriz(Triangulaciones )

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el Orden de la Matriz : ");
        int n = sc.nextInt();

        int mat[][] = new int[n][n];

        // Definimos la matriz

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                mat[i][j] = i + j;
                System.out.print(mat[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println();

        //Definimos Triangulacion Inferior

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                mat[i][j] = i + j;
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //Definimos Triangulacion Superior

        for (int i = 0; i < n; i++) {

            for (int j=0; j<i; j++){
                System.out.print( "\t");
            }

            for (int j = i; j < n ; j++) {
                mat[i][j] = i + j;
                System.out.print(mat[i][j] + "\t");


            }
            System.out.println();
        }


    }
}
