import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        //Serie de Fibonacci Modificada

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de Terminos: ");
        int n = sc.nextInt();

        int a=0, b=1, c=2 ,s = 3,d;
        System.out.print(a+ "\t" + b + "\t"+ c + "\t");
        for (int i=4; i<=n; i++ ){
            d=a+b+c;
            System.out.print( d+ "\t");
            s+=d;
            a=b;
            b=c;
            c=d;

        }


        //Resultado
        System.out.println("\nla suma es = "+s);




    }



}
