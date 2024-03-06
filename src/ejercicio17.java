import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        //Serie de Fibonacci

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de Terminos: ");
        int n = sc.nextInt();

        int a=0, b=1,c,s = 1;
        System.out.print(a+ "\t" +b+ "\t");
        for (int i=2; i<=n; i++ ){
            c=a+b;
            System.out.print("\t"+ c+ "\t");
            s+=c;
            a=b;
            b=c;

        }


        //Resultado
        System.out.println("\nla suma es = "+s);



    }



}
