import java.util.Scanner;

public class ejercicio32 {
    public static void main(String[] args) {
        //Crear un rombo

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del rombo: ");
        int n = sc.nextInt();

        //Proceso

        char r[][] = new char[n][n];

        //Defino rombo con espacios vacios

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r[i][j] = ' ';
            }
        }

        // Defino numerales del rombo

        //la varible m el temaño que representa la mitad de la matriz cuadrada n, se redondea el valor entero al menor
        int m = (n - 1) / 2;


        //Este ciclo crea la FRONTERA del rombo de #

        for (int i = 0; i <=m; i++) {
            /*Se toma en cuenta el ciclo hasta la  mitad de la matriz (n) es decir (m)
             va generando LA FRONTERA del rombo #, tanto por izquierda, derecha ,
             arriba y por abajo */

            r[i][m - i] = '#';/* Array encargado de Generar FRONTERA desde de la itercion 0 hasta m en La parte SUP por
                                 la IZQ*/
            r[i][m + i] = '#';/*Array encargado de Generar FRONTERA desde de la itercion 0 hasta m  en La parte SUP por
                                   la DER*/
            r[n - i - 1][m - i] = '#';/*Array encargado de Generar FRONTERA desde de la itercion 0 hasta m en La parte
                                         INF  por la IZQ */
            r[n - i - 1][m + i] = '#';/*Array encargado de Generar FRONTERA desde de la itercion 0 hasta m en La parte
                                            INF  por la DER */
        }


        //LLenamos internamente el rombo

        /*Este Ciclo hace el relleno desde la iteracion 1  por que en la 0 ya hay # hasta la mitad de la matriz,
        esta seria la frontera*/

        for (int i = 1; i <= m; i++) {

            /*Este Ciclo va  rellenando j desde la izquierda desde las Zonas vacias dentro del Rombo
            estas son  ( m - i + 1, m + i) */
            for (int j = m - i + 1; j < m + i; j++) {
                r[i][j] = '#'; /*Array que llena el ROMBO de la mitad hacia ARRIBA */
                r[n - i - 1][j] = '#';/*Array que llena el ROMBO de la mitad hacia ABAJO */
            }
        }


        //Imprimimos el rombo

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(r[i][j]);
            }
            System.out.println();
        }


    }
}
