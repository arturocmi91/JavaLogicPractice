import java.util.Scanner;


public class ejercicio37 {
    public static void main(String[] args) {
        //Caballo en conflicto

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese ubicación de los caballos: ");
        String caballos = sc.next();

        //Proceso

        // Definimos el tablero
        int tab[][] = new int[8][8];
        // Definimos el Posiciones de los caballos max 64 caballos
        int posCab[][] = new int[64][2];

        
        int tope = 0;
        int n = caballos.length();
        char col, fil;
        int i = 0;

        while (i < n) {
            col = caballos.charAt(i);
            i++;
            fil = caballos.charAt(i);
            i++;
            i++;
            tab[ef(fil)][ec(col)] = 1;
            posCab[tope][0] = ef(fil);
            posCab[tope][1] = ec(col);
            tope++;

        }

        //Mostramos como quedo el tablero
        show(tab);

        //Analisamos que caballo estan en conflicto
        int movFil, movCol;

        for (i = 0; i < tope; i++) {

            System.out.print( "Analizamos el caballo en : "
                    + efInv(posCab[i][0])
                    + ecInv(posCab[i][1])
                    + "=>");

            //Analisamos Movimientos del caballo Y si estan en conflicto

            // *** 1er:: Up and Left "UL"

            movFil = posCab[i][0] - 2;
            movCol = posCab[i][1] - 1;

            //Condicional If que indica que el resultado tiene que estar dentro del tablero TAB

            if (movCol >= 0 && movCol <= 7 && movFil >= 0 && movFil <= 7) {
                //Si tab en esas esas Celdas da 1 HAY CONFLICTO
                if (tab[movFil][movCol] == 1) {
                    System.out.print(" Conflicto con" + efInv(movFil) + ecInv(movCol) + "\t");
                }
            }

            // *** 2do:: Up and Right "UR"

            movFil = posCab[i][0] - 2;
            movCol = posCab[i][1] + 1;

            if (movCol >= 0 && movCol <= 7 && movFil >= 0 && movFil <= 7) {
                if (tab[movFil][movCol] == 1) {
                    System.out.print(" Conflicto con " + efInv(movFil) + ecInv(movCol) + "\t");
                }
            }

            // *** 3ero:: Left and Up "LU"

            movFil = posCab[i][0] - 1;
            movCol = posCab[i][1] - 2;

            if (movCol >= 0 && movCol <= 7 && movFil >= 0 && movFil <= 7) {
                if (tab[movFil][movCol] == 1) {
                    System.out.print(" Conflicto con " + efInv(movFil) + ecInv(movCol) + "\t");
                }
            }

            // *** 4to:: Left and Down "LD"

            movFil = posCab[i][0] + 1;
            movCol = posCab[i][1] - 2;

            if (movCol >= 0 && movCol <= 7 && movFil >= 0 && movFil <= 7) {
                if (tab[movFil][movCol] == 1) {
                    System.out.print(" Conflicto con " + efInv(movFil) + ecInv(movCol) + "\t");
                }
            }

            // *** 5to:: Right and Up "RU"

            movFil = posCab[i][0] - 1;
            movCol = posCab[i][1] + 2;

            if (movCol >= 0 && movCol <= 7 && movFil >= 0 && movFil <= 7) {
                if (tab[movFil][movCol] == 1) {
                    System.out.print(" Conflicto con " + efInv(movFil) + ecInv(movCol) + "\t");
                }
            }

            // *** 6to:: Right and Down "RD"

            movFil = posCab[i][0] + 1;
            movCol = posCab[i][1] + 2;

            if (movCol >= 0 && movCol <= 7 && movFil >= 0 && movFil <= 7) {
                if (tab[movFil][movCol] == 1) {
                    System.out.print(" Conflicto con " + efInv(movFil) + ecInv(movCol) + "\t");
                }
            }

            // *** 7mo:: Down and Left "DL"

            movFil = posCab[i][0] + 2;
            movCol = posCab[i][1] - 1;

            if (movCol >= 0 && movCol <= 7 && movFil >= 0 && movFil <= 7) {
                if (tab[movFil][movCol] == 1) {
                    System.out.print(" Conflicto con " + efInv(movFil) + ecInv(movCol) + "\t");
                }
            }
            // *** 8vo:: Down and Right "DR"

            movFil = posCab[i][0] + 2;
            movCol = posCab[i][1] + 1;

            if (movCol >= 0 && movCol <= 7 && movFil >= 0 && movFil <= 7) {
                if (tab[movFil][movCol] == 1) {
                    System.out.print(" Conflicto con " + efInv(movFil) + ecInv(movCol) + "\t");
                }
            }

            System.out.println();

        }

    }

    //Metodo Vacio que muestra el tablero
    public static void show(int tab[][]) {
        //Imprime los valores de las Iteraciones en las columnas
        System.out.println("    0   1   2   3   4   5   6   7 ");

        for (int i = 0; i < 8; i++) {


            //Imprime los valores de las iteraciones en las filas
            System.out.print(i + "\t");

            for (int j = 0; j < 8; j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //Metodo EQUIVALENTE FILA

    public static int ef(char fila) {
        switch (fila) {
            case '8':
                return 0;
            case '7':
                return 1;
            case '6':
                return 2;
            case '5':
                return 3;
            case '4':
                return 4;
            case '3':
                return 5;
            case '2':
                return 6;
            default:
                return 7;

        }

    }

    //Metodo EQUIVALENTE COLUMNA

    public static int ec(char columna) {
        switch (columna) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            case 'E':
                return 4;
            case 'F':
                return 5;
            case 'G':
                return 6;
            default:
                return 7;

        }

    }

    //Metodo EQUIVALENTE FILA INVERSA

    public static char efInv(int fila) {
        switch (fila) {
            case 0:
                return '8';
            case 1:
                return '7';
            case 2:
                return '6';
            case 3:
                return '5';
            case 4:
                return '4';
            case 5:
                return '3';
            case 6:
                return '2';
            default:
                return '1';

        }

    }
    //Metodo EQUIVALENTE COLUMNA INVERSA

    public static char ecInv(int columna) {
        switch (columna) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            case 3:
                return 'D';
            case 4:
                return 'E';
            case 5:
                return 'F';
            case 6:
                return 'G';
            default:
                return 'H';

        }

    }

}
