import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Pedimos datos de entrada

        System.out.println("Ingrese numero de Creditos: ");
        int credits= sc.nextInt();
         System.out.println("Ingrese valor del Credito: ");
        int creditValue= sc.nextInt();

        System.out.println("Ingrese el estrato del estudiante : ");
        int studentStatrum= sc.nextInt();

        //Calculos
        int matricula= calculoMatricula(credits,creditValue,studentStatrum);
        int subsidio= calculoSubsidio(studentStatrum);

        //Mostramos resultados

        System.out.println("Costo de matricula: "+ matricula);
        System.out.println("Valor de Subsidio: "+ subsidio);

    }
    public static int calculoMatricula (int credits,int creditValue, int stratum){
        int valorMatricula=0;
        if(credits<=20){
            valorMatricula=credits*creditValue;
        }else {
            valorMatricula=20*creditValue+(credits-20)*creditValue*2;
        }

        int discount=0;
        switch (stratum){
            case 1:discount=(int)(valorMatricula*0.8);break;
            case 2:discount=(int)(valorMatricula*0.5);break;
            case 3:discount=(int)(valorMatricula*0.3);break;
        }
        return valorMatricula-discount;
    }
    public static int calculoSubsidio(int stratum){

        int subsidio=0;
        switch (stratum){
            case 1:subsidio=2000;break;
            case 2:subsidio=1000;break;
        }
        return subsidio;
    }
}
