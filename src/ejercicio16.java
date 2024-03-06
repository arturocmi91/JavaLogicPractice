import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        //buscar Ec. Cuadratica

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el termino a: ");
        int a= sc.nextInt();
        System.out.println("Ingrese el termino b: ");
        int b= sc.nextInt();
        System.out.println("Ingrese el termino c: ");
        int c= sc.nextInt();

        //Calculo

        double raiz=Math.sqrt(b*b-4*a*c);
        double x1=(-b+raiz)/(2*a);
        double x2=(-b-raiz)/(2*a);

        //Resultado

            System.out.printf("x1:%f\n ",x1);
            System.out.printf("x2:%f\n ",x2);
}



}
