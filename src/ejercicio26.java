import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        //Ejercicio 26 Vector

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de posiciones : ");
        int n = sc.nextInt();
        //Proceso


        int vec[] = new int[n];
        //  Llenamos el arreglo
        System.out.println("Sin Ordenar");
        int contPar = 0, contImpar = 0;
        for (int i = 0; i < n; i++) {

            if (esPar(i)) {
                vec[i] = (i * i) + 1;
            } else {
                vec[i] = (i + 1) * 3;

            }

            if (esPar(vec[i])) {
                contPar++;
            } else {
                contImpar++;
            }

            System.out.println("Vec [" + i + "]= " + vec[i]);

        }

        //Creamos arreglos pares e impares

        int par[] = new int[contPar];
        int impar[] = new int[contImpar];

        //Llenamos arreglos Auxiliares

        int k = 0, l = 0;

        for (int i = 0; i < n; i++) {

            if (esPar(vec[i])) {
                par[k] = vec[i];
                k++;
            } else {
                impar[l] = vec[i];
                l++;

            }


        }

        // Ordenamos el arreglo de Pares Descendentemente

        int aux = 0;

        for (int i = 0; i < contPar - 1; i++) {
            for (int j = i + 1; j < contPar; j++) {
                if (par[i] < par[j]) {
                    aux = par[i];
                    par[i] = par[j];
                    par[j] = aux;
                }

            }
        }

        // Ordenamos el arreglo de Impares Ascendentemente

        for (int i = 0; i < contImpar - 1; i++) {
            for (int j = i + 1; j < contImpar; j++) {
                if (impar[i] > impar[j]) {
                    aux = impar[i];
                    impar[i] = impar[j];
                    impar[j] = aux;
                }

            }
        }

        //Colocamos posiciones en el arreglo Original

        for (int i = 0; i < contPar; i++) {
            vec[i] = par[i];
        }
        for (int i = 0; i < contImpar; i++) {
            vec[i + contPar] = impar[i];
        }

        //Mostramos el arreglo Ordenado
        System.out.println("Ordenado");
        for (int i = 0; i < n; i++) {
            System.out.println("Vec [" + i + "]= " + vec[i]);

        }


        // Ordenamos el arreglo
        /* NOTA : Si se ordena ASCENDENTE la comparacion es (VEC[i] > VEC[j])
        ---------Si se ordena DESCENDENTE la comparacion es (VEC[i] < VEC[j])



        int aux = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (vec[i] < vec[j]) {
                    aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                }

            }
        }  */


    }

    public static boolean esPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
