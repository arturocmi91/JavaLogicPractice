import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {
        //Calcular la Viga

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la viga: ");
        //Pido dato de Entrada
        String viga = sc.nextLine();

        //Proceso

        if (esValida(viga)) {

            if(soportaPeso(viga)){
                System.out.println("La viga soporta el peso! ");
            }else {
                System.out.println("La viga NO soporta el peso! ");
            }

        } else {
            System.out.println("La viga está mal construida! ");
        }


    }

    public static boolean esValida(String viga) {
        // Condiciones de la base
        String base = viga.substring(0, 1);
        if (!(base.equals("#") || base.equals("%") || base.equals("&"))) {
            return false;

        }
        //Analisamos que la viga no tenga otros elemnetos, que no tengas dos o mas elementos


        int n = viga.length();
        int conCnx = 0;
        for (int i = 1; i < n; i++) {

            String pieza = viga.substring(i, i + 1);

            if (!(pieza.equals("=") || pieza.equals("*"))) {
                return false;
            }

            if (pieza.equals("*")) {
                conCnx++;
            } else {
                conCnx = 0;
            }

            if (conCnx == 2) {
                return false;

            }


        }
        return true;
    }

    public static boolean soportaPeso(String viga) {
        // Condiciones de la base
        String base = viga.substring(0, 1);

        //Calcular el peso de la viga
        //Conexiones Seguidas

        int n = viga.length();
        int pesoTotal = 0;
        int pesoSegmento = 0;
        for (int i = 1; i < n; i++) {
            String pieza = viga.substring(i, i + 1);
            if (pieza.equals("=")) {
                pesoSegmento++;

            } else {
                pesoTotal = +pesoSegmento * 3;
                pesoSegmento = 0;
            }
        }
        pesoTotal = +pesoSegmento;


        int pesoBase = 0;
        switch (base) {
            case "%":
                pesoBase = 10;
                break;
            case "&":
                pesoBase = 20;
                break;
            case "#":
                pesoBase = 30;
                break;
        }


        return pesoBase>=pesoTotal;


    }


}
