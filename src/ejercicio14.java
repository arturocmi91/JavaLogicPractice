import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        //buscar factorial

        Scanner sc= new Scanner(System.in);
        System.out.println("Cuantos Terminos Desean: ");
        int n= sc.nextInt();
        System.out.println("Ingrese el valor de X: ");
        int x= sc.nextInt();

        //Calculo

        double s=0,t;

        for(int i=0;i<n;i++){
            t= Math.pow(x,i)/factorial(i);
            s+=t;
        }



        System.out.printf("f(%d)=%f\n ",x,s);
}

public static double factorial(int n){
        double aux=1;
        for(int i=2 ; i<=n; i++){
            aux*=i;
        }
        return aux;
}


}
