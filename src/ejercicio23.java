import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
        //Crear Calendario

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el año: ");
        int year = sc.nextInt();

        //Proceso

        for (int i = 1; i <= 12; i++) {
            System       .out.println("\nMes: " + i);
            System.out.println("Dom\tLum\tMar\tMie\tJue\tVie\tSab");
            int days = diasMes(year, i);


            //Calculamos espacios para que el dia del mes empiece en el correcto de la semana

            int z = zeller(year,i);
            int counDays = 0;

            for(int k=0; k<z ;k++){
                counDays++;
                System.out.print("\t");


            }

            //Imprimimos los dias del mes

            for (int j = 1; j <= days; j++) {
                System.out.print(j + "\t");
                counDays++;
                if (counDays == 7) {
                    System.out.println("");
                    counDays = 0;
                }
            }
        }

    }

    //Devuelve
    /* 0 = Dom, 1 = Lun, 2 = Mar, 3 = Mie, 4 = Jue, 5 = Vie, 6 = Sab */

    public static int zeller(int ano, int mes) {
        int a = (14 - mes) / 12;
        int y = ano - a;
        int m = mes + 12 * a - 2;
        int dia = 1, d;

        d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

        return (d);

    }

    public static int diasMes(int ano, int mes) {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return 31;
        } else if (mes == 2) {
            if (esBisiesto(ano)) {
                return 29;
            } else {
                return 28;
            }

        } else {
            return 30;
        }
    }

    //Funcion para devolver si es o no bisiesto
    public static boolean esBisiesto(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return true;
            }

        } else {
            return false;
        }
    }
}
