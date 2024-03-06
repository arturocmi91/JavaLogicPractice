import java.util.Scanner;

public class ejercicio36 {
    public static void main(String[] args) {
        //Cocechando El Caballo

        Scanner sc = new Scanner(System.in);

        //Datos de Entrada
        System.out.print("Ingrese la ubicacion de los Frutos: ");
        String fru = sc.next();

        System.out.print("Ingrese la Posicion Inicial del Caballo: ");
        String cab = sc.next();

        System.out.print("Ingrese los Movimientos del Caballo: ");
        String mov = sc.next();

        //Proceso

        //Ubicar los frutos en el tablero

        /*Explicacion de los elemnetos :
        - char tab[][] = new char[8][8] *** Declaracion Array que representado con su dimencion y tipo de dato 'Char' ***
        - int n = fru.length() *** dimension del texto String fru
        - int i =0  contador de iteraciones en la cadena de caracteres
        - char fil, col, elm; ***  Elemnetosn que descomponen el STRING en CHAR .
          ejm ==  C4+  donde C(col) 4(fil) y +(elm)  */

        char tab[][] = new char[8][8];
        //Inicializamos el tablero
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tab[i][j] = ' ';
            }
        }
        int n = fru.length(), i = 0;
        char fil, col, elm;

        //Bucle WHILE que se encarga de llenar el ARRAY con elementos

        while (i < n) {
            col = fru.charAt(i);
            i++;
            fil = fru.charAt(i);
            i++;
            elm = fru.charAt(i);
            i++;
            i++;

            //Funcion encargada de llenarlos llamando a los metodos ef y ec (Llevarlo al ARRAY DEL TABLERO)
            tab[ef(fil)][ec(col)] = elm;


        }
        //Mostramos el tablero
        show(tab);

        //Ubicaion del Caballo
        col = cab.charAt(0);
        fil = cab.charAt(1);
        //Posicion dentro del Array del TABLERO
        int posCol = ec(col);
        int posFil = ef(fil);
        String cosecha = " ";

        //Se posiciona el caballo

        if (tab[posFil][posCol] != ' ') {
            cosecha = " " + tab[posFil][posCol];
        }

        // Recorremos todos los movimentos del Caballo

        n = mov.length();
        i = 0;
        while (i < n) {
            String moving = mov.substring(i, i + 2);
            switch (moving) {
                case "UL":
                    posFil -= 2;
                    posCol -= 1;
                    break;
                case "UR":
                    posFil -= 2;
                    posCol += 1;
                    break;
                case "LU":
                    posFil -= 1;
                    posCol -= 2;
                    break;
                case "LD":
                    posFil += 1;
                    posCol -= 2;
                    break;
                case "RU":
                    posFil -= 1;
                    posCol += 2;
                    break;
                case "RD":
                    posFil += 1;
                    posCol += 2;
                    break;

                case "DL":
                    posFil += 2;
                    posCol -= 1;
                    break;
                default:
                    posFil += 2;
                    posCol += 1;
                    break;

            }
            //Avanzamos tres casillas hasta el otro movimento
            i += 3;
            if (tab[posFil][posCol] != ' ') {
                cosecha = cosecha + tab[posFil][posCol];
            }
        }
        System.out.println("Los frutos recogidos son: " + cosecha);


    }

    //Metodo Vacio que muestra el tablero
    public static void show(char tab[][]) {
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

    //Metodo devuelve Equivalente de la Fila
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

    //Metodo devuelve  Equivalente  de la Columna
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


}

