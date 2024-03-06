import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Pedimos datos de entrada

        System.out.println("Ingrese numero de unidades: ");
        int numUnit= sc.nextInt();

        final int desk= 650;
        int discount;

        int total=numUnit*desk;


        if (numUnit < 5){
           discount = (int)(desk*0.1);
            System.out.println("Se le aplica un 10% de descuento");
        }else if (numUnit>=5 && numUnit<10 )
        {
            discount = (int)(desk*0.2);
            System.out.println("Se le aplica un 20% de descuento");

        }else{
            discount = (int)(desk*0.4);
            System.out.println("Se le aplica un 40% de descuento");
        }
        System.out.println("El valor a pagar es :"+ (total - discount));

    }
}
