import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        //buscar el mayor numero

        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int a= sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int b= sc.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int c= sc.nextInt();

        if (a>b && a>c ){
            System.out.println("El numero mayor es: " + a);

        }else if (b>a && b>c ){
            System.out.println("El numero mayor es: " + b);}
        else{System.out.println("El numero mayor es: " + c);}

    }
}
