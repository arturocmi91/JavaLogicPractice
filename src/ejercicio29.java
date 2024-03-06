import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args) {
        //Puente de Madison

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Puente: ");
        //Introducir estructura del Puente
        String puente = sc.nextLine();
        //Procedimiento
        if(condicionPuente(puente)){
            System.out.println("Valido");
        }else {
            System.out.println("Invalido");
        }
    }

    public static boolean condicionPuente(String puente) {


        int n = puente.length();

        //Condicion de las  Base


        if (!(puente.substring(0, 1).equals("*") && puente.substring(n - 1, n).equals("*"))) {
            return false;

        }
        //Condicion que los caracteres sean correctos
        int conREF = 0;
        for (int i = 1; i < n - 1; i++) {
            String pieza = puente.substring(i, i + 1);
            if (!(pieza.equals("=") || pieza.equals("+"))) {
                return false;


            }
            if (pieza.equals("=")){
                conREF++;

            }else {
                conREF=0;
            }
            if(conREF==4){
                return false;
            }
        }
        //Validar resto de condiones

        for (int i = 1; i < n / 2; i++) {
            String pIzq = puente.substring(i, i + 1);
            String pDer = puente.substring(n - i - 1, n - i);

            if (!pIzq.equals(pDer)) {
                return false;

            }
            if (pIzq.equals("+")) {
                conREF++;
            } else {
                conREF = 0;
            }

            if (conREF == 3) {
                return false;
            }

        }
        return true;
    }

}
