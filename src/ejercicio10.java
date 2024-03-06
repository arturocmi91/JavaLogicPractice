import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Pedimos datos de entrada


        System.out.println(" ***DATOS DE ENTRADA*** ");
        System.out.print("Ingrese el Costo de Compra...........................................: ");
        int CC= sc.nextInt();
        System.out.print("Tipo de producto, [P]erecedero o [N]o Perecedero.....................: ");
        String TP= sc.next();

        System.out.print("Tipo de Conservaciòn , [F]rio o [A]mbiente...........................: ");
        String TC= sc.next();

        System.out.print("Periodo de Conservaciòn en dias......................................: ");
        int PC= sc.nextInt();

        System.out.print("Periodo de Almacenamiento en dias....................................: ");
        int PA= sc.nextInt();

        System.out.print("Volumen en Litros....................................................: ");
        int vol= sc.nextInt();

        System.out.print("Medio de alamcenamiento, [N]evera [C]ongelador [E]stanteria [G]uacal.: ");
        String MA= sc.next();

        //Calculos
        int CA=calcularCostoAlmacenamiento(TP,CC,TC,PC,PA,vol);
        int CE= calcularCostoExibición(TP,TC,MA,CA);
       double PDP= calcularPorcentajeDepreciaciónProducto(PA);


        //Mostramos resultados
        System.out.println(" ***CALCULOS*** ");

        System.out.printf("Costo del Producto....................................................:%10d\n",CC);
        System.out.printf("Costo de Almacenamiento...............................................:%10d\n",CA);
        System.out.printf("Costo de Exibición....................................................:%10d\n",CE);
        System.out.printf("Porcentaje de Depreciación del Producto...............................:%10.2f\n",PDP);

        int VR_P=(int)((CC+ CA+CE)*(PDP));

            System.out.printf("El valor de Producto..................................................:%10d\n",VR_P);

        if (TP.equalsIgnoreCase("n")){
            System.out.printf("El valor de venta 'VR_V'..............................................:%10d\n",(VR_P + (int)(VR_P*0.2)) );

        } else if (TP.equalsIgnoreCase("p")) {

            System.out.printf("El valor de venta 'VR_V'..........................................:%10d\n",(VR_P + (int)(VR_P*0.4)) );
        }




    }

    public static int calcularCostoAlmacenamiento(String TP, int CC,String TC,int PC,int PA,int vol){


        if (TP.equalsIgnoreCase("p")){ // cond Perecedero

            if (TC.equalsIgnoreCase("f")){ // Tipo de conserv FRIO

                if   (PC<10){
                    return (int)(CC*0.05);
                } else   {
                    return  (int)(CC*0.1);}
            }else{  // TC CALIENTE
                if ( PA<20) {
                   return (int)(CC*0.03);
                } else if (  PA>20) {
                    return  (int)(CC*0.1);}
                else {
                    return  (int)(CC*0.05);
                }
            }

        }else{   // No perecedero

            if (vol>=50){
              return   (int)(CC*0.10);
            } else {
              return  (int)(CC*0.20);
            }
        }

    }

    public static int calcularCostoExibición(String TP,String TC,String MA, int CA) {

        if (TP.equalsIgnoreCase("p")) { //PERECEDEROS
            if (MA.equalsIgnoreCase("n")) { // NEVERA
                return CA * 2;
            } else {//CONGELADOR
                return CA;
            }
        } else {//NO PERECEDEROS
            if (MA.equalsIgnoreCase("e")) { // ESTANTERIA
                return (int) (CA * 0.05);
            } else if (MA.equalsIgnoreCase("g")) {  //GUACAL
                return (int) (CA * 0.07);
            }

        }
        return CA;
    }



    public static double calcularPorcentajeDepreciaciónProducto( int PA){

        if(PA <30){
           return 0.95;

        }else {

           return 0.85;

        }

    }


}
