import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        //buscar numero si es par o impar

        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int num= sc.nextInt();

        if (num % 2==0 ){
            System.out.println("El numero es par");

        }else {System.out.println("El numero es impar");}

    }
}
