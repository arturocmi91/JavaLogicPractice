import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        //buscar factorial

        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int num= sc.nextInt();

        System.out.printf("El factorial de %d es %.0f\n ",num,factorial(num));
}

public static double factorial(int n){
        double aux=1;
        for(int i=2 ; i<=n; i++){
            aux*=i;
        }
        return aux;
}


}
