import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        //buscar cuantos numeros deseas

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros deseas: ");
        int num = sc.nextInt();

        int count = 0;
        int sum = 0;

        /*
        //Con bucle While
        while(count<num){
            count++;
            sum+=count;
            System.out.print(count + "\t");

        }*/

        //Con bucle For

        for (count = 1; count <= num; count++) {
            sum += count;
            System.out.print(count + "\t");

        }


        System.out.println("\nLa Sumatoria es :" + sum);
        System.out.println("El Promedio es :" + (sum / num));


    }


}
