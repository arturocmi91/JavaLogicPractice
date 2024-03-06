import java.util.Scanner;

public class ejercicio27 {
    public static void main(String[] args) {
        //Frases Palindromas

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase (sin tildes): ");
        String prh = sc.nextLine();
        //--- Procesos ---

        if (esPalindroma(prh)) {
            System.out.println("La frase es Palindroma");
        } else {
            System.out.println("La frase no es Palindroma");
        }


    }

    public static boolean esPalindroma(String prh) {

        // Eliminar los espacios en blanco

        String aux = "";
        int n= prh.length();
        for (int i = 0; i < n; i++) {
            // Condicion SINO pasa nada de lo de abajo se va acumulando en AUX las palabras pegadas.
            if (!(prh.substring(i, i + 1).equals(" ")
                    || prh.substring(i, i + 1).equals(",")
                    || prh.substring(i, i + 1).equals("¿")
                    || prh.substring(i, i + 1).equals("?")
                    || prh.substring(i, i + 1).equals(".")
                    || prh.substring(i, i + 1).equals("!")
                    || prh.substring(i, i + 1).equals("¡"))) {

                aux =aux+ prh.substring(i, i + 1).toLowerCase();

            }
        }
        System.out.println(aux);
        n=aux.length();

        //Ciclo que devuelve un Boolean dependiendo del 'SINO'

        for (int i = 0; i < n / 2; i++) {

            //Ciclo I que estudia el la frase restruturada en el AUX   desde la mitad de la misma


            if (!aux.substring(i, i + 1).equals(aux.substring(n - i - 1, n - i))) {

                /*IFNOT que verifica que la palabra sea igual desde el inio a la mitad y la compara desde la mitad hasta
                el final */
                return false;
            }
        }
        return true;

    }
}
