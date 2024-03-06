import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        //buscar si el año es biciesto o no


        Scanner sc= new Scanner(System.in);

        //Ingrese dato
        System.out.println("Introduce año: ");
        int year= sc.nextInt();

        //imprime la respuesta dada por la funcion
        if (esBisiesto(year)){
            System.out.println("El año es : " +year+ " es bisiesto");
        }else {
            System.out.println("El año es : " +year+ " no es bisiesto");}

    }
    //Funcion para devolver si es o no bisiesto
    public static boolean esBisiesto (int year){

        if(year % 4==0 )
        {if(year %100==0){

            if (year %400==0){
                return true;
            } else {
                return false;}

        }else{
           return true;}

        }else{
            return false;}
    }
}
