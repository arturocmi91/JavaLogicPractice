import java.util.Scanner;

public class ejercicio35 {
    public static void main(String[] args) {
        // DESCOMPOSICION EN FACTORES

        Scanner sc = new Scanner(System.in);

        //**** Entrada de Datos ****

        System.out.println("Ingrese el número a descomponer: ");
        int n = sc.nextInt();
        // **** Procedimiento ****

        // **** Definimos la dimencion del ARRAY ****
        int m[][] = new int[50][2];
        //****  Inicalizamos el TOPE ****
        int tope = 0;
        //****  Definimos  el valor del tope en la coordeneda del ARRAY y que va a ser el valor a Descomponer "n" ****
        m[tope][0] = n;

        //****  Hacemos que la variable  "i" sirva para todos los ciclos , no solo el FOR ****
        int i;


        //**** Ciclo MIENTRAS NO sea primo va guardando valores No primos en las celdas ****

        while (!esPrimo(m[tope][0])) {

            //Ciclo FOR para definir  valor  i (que seria divisible entre su tope o que lo descompone )
            for (i = 2; i < m[tope][0]; i++) {

                if (m[tope][0] % i == 0) {
                    break;
                }
                //NOTA *** ESTE EVALUA EL PRIMER CICLO , Y HASTA QUE NO SE CUMPLA LA CONDICION IF ,NO SE ROMPE ***
            }
            /*Definen los siguentes elementos:
             - m[tope][1] = i; la j que es igual a la i divisible  saliente del ciclo FOR
             - m[tope + 1][0] = m[tope][0] / i; Define la celda  i que esta abajo del TOPE del ARRAY
             - Se acumula TOPE(este da la cantidad de interaciones no primas)*/

            m[tope][1] = i;
            m[tope + 1][0] = m[tope][0] / i;
            tope++;
        }
        //Guarda los valores cuando se cumpla la condicion de Primos.
        m[tope][1] = m[tope][0];

        //**** Imprimimos Resultado ****

        System.out.println("*** Resultado ***");
        //Inicalizamos Variable STRING de la siguiente manera
        String fac = n + " = ";
        //Le vamos acumulando resultados  en funcion a un Ciclo for de TOPE
        for (i = 0; i <= tope; i++) {
            fac = fac + m[i][1] + " x ";
        }
        /* Quitamos la ultima x : en el rango dado por la SubString (desde 0 del STRING, hasta
        el final del STRING menos 3 espacios)*/
        fac = fac.substring(0, fac.length() - 3);
        System.out.println(fac);

        //**** Imprimimos  resultado simplificado ****
        System.out.println("*** Resultado Simplificado ***");

        /* Para Simplificar:
         -Inicializamos de nuevo  "i" en "0"
         -Declaramos una nueva variable fac "facSimply"
         -Un Contador con y en auxiliar Aux */

        i = 0;
        String facSimply = n + " = ";
        int con, aux;

        /* Ciclo While que va definiendo la BASE DEL EXPONENTE " AUX "
        (mientras se cumpla la iteracion tope "que no sea primo")*/

        while (i <= tope) {
            aux = m[i][1];
            con = 0;
            //Ciclo While que define el EXPONENTE mediante el contador "con" mientras se cumpla las condiciones.
            while (i <= tope && aux == m[i][1]) {
                con++;
                i++;
            }
            //Condicion que imprima exponentes mayores a 1
            if (con > 1) {
                facSimply = facSimply + aux + " ^ " + con + " x ";
            }else {
                facSimply = facSimply + aux  + " x ";
            }
        }
         /* Quitamos la ultima x : en el rango dado por la SubString (desde 0 del STRING, hasta
        el final del STRING menos 3 espacios)*/
        facSimply = facSimply.substring(0, facSimply.length() - 3);
        System.out.println(facSimply);


    }

    public static boolean esPrimo(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
