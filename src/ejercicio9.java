import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Pedimos datos de entrada

        System.out.print("Ingrese el peso de la mercancia: ");
        int weight= sc.nextInt();
         System.out.print("Ingrese valor de la mercancia: ");
        int worth= sc.nextInt();

        System.out.print("Es Lunes [S]i o [N]o: ");
        String isMonday= sc.next();

        System.out.print("Tipo de Pago [E]fectivo [T]arjeta: ");
        String paymentType= sc.next();

        //Calculos

        int fee = calculateFee(weight);
        int discount= applyDiscuount(worth,fee);
        int promotion= applyPromotions(isMonday,paymentType,worth,fee);

        //Mostramos resultados

        if (promotion>0){
            System.out.println("Tarifa: "+fee);
            System.out.println("Promocion: "+promotion);
            System.out.println("Total a pagar: "+(fee-promotion));
        }else {
            System.out.println("Tarifa: "+fee);
            System.out.println("Descuento: "+discount);
            System.out.println("Total a pagar: "+(fee-discount));
        }
    }

    public static int calculateFee (int weight){
        int fee=0;
        if(weight<100){
            fee=20;

        } else if (weight>=100 && weight<=150) {
            fee=25;
            
        }else if (weight>150 && weight<=200){
            fee=30;
        }else {
            fee=35+ (weight-200)/10*2;
        }
        return  fee;

    }
    public static int applyDiscuount(int worth,int fee){

        int dscnt=0;

        if (worth <= 300 && worth>=600){
            dscnt=(int)(fee*0.1);
        } else if (worth>600 && worth<=1000) {
            dscnt=(int)(fee*0.2);
        }else{
            dscnt=(int)(fee*0.3);
        }
        return dscnt;
    }

    public static int applyPromotions(String isMonday, String payment,int worth, int fee){
        int promotion=0;
        if (isMonday.equalsIgnoreCase("s")&& payment.equalsIgnoreCase("t")){
            promotion=(int)(fee*0.5);
        } else if (payment.equalsIgnoreCase("e")&& worth>1000) {
            promotion=(int) (fee*0.6);
        }
        return promotion;

    }




}
