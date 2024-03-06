import java.util.Scanner;

public class ejercicio30 {
    public static void main(String[] args) {
        //Operaciones en una matriz(Matriz Cuadrada)

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el Orden de la Matriz Cuadrada: ");
        int n = sc.nextInt();
        int s = 0, may = -999999, men = 999999;

        int mat[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (i + 1) - j;

                System.out.print(mat[i][j] + "\t");

                s += mat[i][j];

                if (mat[i][j] > may) {
                    may = mat[i][j];
                }
                if (mat[i][j] < men) {
                    men = mat[i][j];
                }


            }
            System.out.println();
        }
        System.out.println("La sumatoria es : " + s);
        System.out.println("El valor Maximo es : " + may);
        System.out.println("El valor Minimo es : " + men);

    }
}
