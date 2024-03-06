import java.util.Scanner;

public class ejercicio33 {
    public static void main(String[] args) {
        //Multiplicador de Matrices

        Scanner sc = new Scanner(System.in);
        //Introducir Valores m, n & p

        System.out.println("Introduce el Valor de m: ");
        int m = sc.nextInt();
        System.out.println("Introduce el Valor de n: ");
        int n = sc.nextInt();
        System.out.println("Introduce el Valor de p: ");
        int p = sc.nextInt();

        //Definimos los Arrays de las  matrices

        int a[][] = new int[m][n];
        int b[][] = new int[n][p];
        int c[][] = new int[m][p];

        //Llenamos la  Matriz A
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Definimos el relleno de sus celdas
                a[i][j] = (i + 1) * j;

            }
        }
        //Llenamos la  Matriz B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                // Definimos el relleno de sus celdas
                b[i][j] = (j + 1) * i;

            }
        }
        //Llenamos la matriz C multiplicando A*B

        /**/
             /*Ciclo que define las filas (m) de la nueva Matriz C*/
        for (int i = 0; i < m; i++) {
            /*Ciclo que define la Columna (m) de la nueva Matriz C*/
            for (int j = 0; j < p; j++) {
                /*Ciclo en el que se realiza la operacione de multipliacion  de la nueva Matriz C. Se tiene que realizar
                este nuevo Bucle , ya que hay que definir el entorno donde se pueda hacer operaciones con el valor de "n"
                 ,es decir A(m * n) y B(n * p).
                 */
                for (int k = 0; k < n; k++) {

                    /*  Ya que  C(m * p)= C(m * p) + A(m * n) * B(n * p)
                    Sabiendo que  C esta inicializado en 0 */

                    c[i][j] += a[i][k] * b[k][j];

                }

            }
        }

        //Imprimimos matriz mediante el metodo Vacio:

        System.out.println("***** Matriz A *****");
        showMatrix(a,m,n);
        System.out.println("***** Matriz B *****");
        showMatrix(b,n,p);
        System.out.println("***** Matriz C *****");
        showMatrix(c,m,p);



    }
    //Metodo Vacio que imprime las matrices

    public static void showMatrix(int m[][], int f, int c) {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
