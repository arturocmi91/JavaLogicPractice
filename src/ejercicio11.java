import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos datos de entrada


        System.out.println(" ***DATOS DE ENTRADA*** ");
        System.out.print("Ingrese numero de viajes...............: ");
        int trips = sc.nextInt();
        System.out.print("Ingrese Ruta,[1] [2] [3] [4]...........: ");
        int route = sc.nextInt();


        System.out.print("Número de pasajeros por ruta...........: ");
        int passengers = sc.nextInt();

        System.out.print("Numero de paquetes de menos de 10 Kg...: ");
        int packagesLess10 = sc.nextInt();

        System.out.print("Numero de paquetes entre 10 Kg y 20 Kg : ");
        int packages10And20 = sc.nextInt();

        System.out.print("Numero de paquetes de mas de 20 Kg.....: ");
        int packagesMore20 = sc.nextInt();


        //Calculos

        int passengerRevenue = calcularIngresoPasajeros(trips, route, passengers);
        int shipmentRevenue = calcularIngresoPaquetes(route, packagesLess10, packages10And20, packagesMore20);

        int totalRevenue=passengerRevenue + shipmentRevenue;
        int helperPay = calcularPagoAyudante(totalRevenue);
        int insurancePay = calcularPagoSeguro(totalRevenue);
        int consume= calculoPagoGasolina(route,trips,passengers,packagesLess10,packages10And20,packagesMore20);
        int totalDeductions= helperPay + insurancePay + consume;
        int totalSettled= totalRevenue-totalDeductions;



        //Mostramos resultados
        System.out.println(" ***CALCULOS*** ");
        System.out.printf("Ingresos por Pasajeros................:%10d\n",passengerRevenue);
        System.out.printf("Ingresos por Paquetes.................:%10d\n",shipmentRevenue);
        System.out.printf("                                ======\n");
        System.out.printf("TOTAL INGRESOS........................:%10d\n",totalRevenue);
        System.out.printf("Pago Ayudante.........................:%10d\n",helperPay);
        System.out.printf("Pago del Seguro.......................:%10d\n",insurancePay);
        System.out.printf("Consumo del combustible...............:%10d\n",consume);
        System.out.printf("                                ======\n");
        System.out.printf("TOTAL DE DEDUCCIONES..................:%10d\n",totalDeductions);
        System.out.printf("                                ======\n");
        System.out.printf("TOTAL A LIQUIDAR......................:%10d\n",totalSettled);





    }

    public static int calcularIngresoPasajeros(int viajes, int ruta, int pasajeros) {
        int valor = 0;

        switch (ruta) {//Evaluar valor de las rutas por numeros de pasajeros
            case 1:
                valor = viajes * 500;
                if (pasajeros > 50 && pasajeros <= 100) {
                    valor = (int) (valor * 1.05);
                } else if (pasajeros > 100 && pasajeros <= 150) {
                    valor = (int) (valor * 1.06);

                } else if (pasajeros > 150 && pasajeros <= 200) {
                    valor = (int) (valor * 1.07);

                } else if (pasajeros > 200) {
                    valor = (int) (valor * 1.07);
                    valor += (pasajeros - 200) * (5);
                }
                break;
            case 2:
                valor = viajes * 600;
                if (pasajeros > 50 && pasajeros <= 100) {
                    valor = (int) (valor * 1.07);
                } else if (pasajeros > 100 && pasajeros <= 150) {
                    valor = (int) (valor * 1.08);

                } else if (pasajeros > 150 && pasajeros <= 200) {
                    valor = (int) (valor * 1.09);

                } else if (pasajeros > 200) {
                    valor = (int) (valor * 1.09);
                    valor += (pasajeros - 200) * (6);
                }
                break;
            case 3:
                valor = viajes * 800;
                if (pasajeros > 50 && pasajeros <= 100) {
                    valor = (int) (valor * 1.10);
                } else if (pasajeros > 100 && pasajeros <= 150) {
                    valor = (int) (valor * 1.13);

                } else if (pasajeros > 150 && pasajeros <= 200) {
                    valor = (int) (valor * 1.15);

                } else if (pasajeros > 200) {
                    valor = (int) (valor * 1.15);
                    valor += (pasajeros - 200) * (10);
                }
                break;
            case 4:
                valor = viajes * 1000;
                if (pasajeros > 50 && pasajeros <= 100) {
                    valor = (int) (valor * 1.125);
                } else if (pasajeros > 100 && pasajeros <= 150) {
                    valor = (int) (valor * 1.15);

                } else if (pasajeros > 150 && pasajeros <= 200) {
                    valor = (int) (valor * 1.17);

                } else if (pasajeros > 200) {
                    valor = (int) (valor * 1.17);
                    valor += (pasajeros - 200) * (15);
                }
                break;

        }
        return valor;

    }

    public static int calcularIngresoPaquetes(int ruta, int paquetes10, int paquetes10y20, int paquetesMas20) {


        int valor = 0;
        if (ruta == 1 || ruta == 2) { //Evalua la ruta 1 y 2

            //Evaluar el Numero de paquetes menores a 10Kg
            if (paquetes10 < 50) {

              valor += 10 * paquetes10;

            } else if (paquetes10 >= 50 && paquetes10 <= 100) {

                valor += 12 * paquetes10;

            } else if (paquetes10 > 100 && paquetes10 <= 130) {


                valor += 15 * paquetes10;

            } else if (paquetes10 > 130) {


                valor += 16 * paquetes10;

            }




            //Evaluar el Numero de paquetes de más de 10Kg

            int totalPaquetesMas10 = paquetes10y20 + paquetesMas20;
            if (totalPaquetesMas10< 50) {

                valor += 12 * totalPaquetesMas10;

            } else if (totalPaquetesMas10 >= 50 && totalPaquetesMas10 <= 100) {

                valor += 14 * totalPaquetesMas10;

            } else if (totalPaquetesMas10 > 100 && totalPaquetesMas10 <= 130) {


                valor += 16 * totalPaquetesMas10;

            } else if (totalPaquetesMas10 > 130) {


                valor += 18 * totalPaquetesMas10;

            }

        } else {    // para la ruta 3 y 4


            //Evaluar el Numero de paquetes menores a 10Kg
            if (paquetes10 < 50) {

                valor += 13 * paquetes10;

            } else if (paquetes10 >= 50 && paquetes10 <= 100) {

                valor += 16 * paquetes10;

            } else if (paquetes10 > 100 && paquetes10 <= 130) {


                valor += (int) (17.5 * paquetes10);

            } else if (paquetes10 > 130) {


                valor += 20 * paquetes10;

            }

            //Evaluar el Numero de paquetes de  10Kg y 20Kg

            if (paquetes10y20 < 50) {

                valor += 14 * paquetes10y20;

            } else if (paquetes10y20 >= 50 && paquetes10y20 <= 100) {

                valor += 18 * paquetes10y20;

            } else if (paquetes10y20 > 100 && paquetes10y20 <= 130) {


                valor += 20 * paquetes10y20;

            } else if (paquetes10y20 > 130) {


                valor += 25 * paquetes10y20;

            }

            //Evaluar el Numero de paquetes de más de 20Kg

            if (paquetesMas20 < 50) {

                valor += 17 * paquetesMas20;

            } else if (paquetesMas20 >= 50 && paquetesMas20 <= 100) {

                valor += 21 * paquetes10y20;

            } else if (paquetesMas20 > 100 && paquetesMas20 <= 130) {


                valor += 25 * paquetesMas20;

            } else if (paquetesMas20 > 130) {


                valor += 30 * paquetesMas20;

            }

        }

        return valor;
    }

    public static int calcularPagoAyudante(int ingresos) {

        if (ingresos < 1000) {
            return (int) (ingresos * 0.05);
        } else if (ingresos >= 1000 & ingresos <= 2000) {

            return (int) (ingresos * 0.08);

        } else if (ingresos > 2000 & ingresos < 4000) {

            return (int) (ingresos * 0.1);

        } else if (ingresos > 4000) {

            return (int) (ingresos * 0.13);

        }
        return ingresos;

    }

    public static int calcularPagoSeguro(int ingresos) {

        if (ingresos < 1000) {
            return (int) (ingresos * 0.03);
        } else if (ingresos >= 1000 & ingresos <= 2000) {

            return (int) (ingresos * 0.04);

        } else if (ingresos > 2000 & ingresos < 4000) {

            return (int) (ingresos * 0.06);

        } else if (ingresos > 4000) {

            return (int) (ingresos * 0.09);

        }
        return ingresos;

    }

    public static int calculoPagoGasolina(int ruta, int viajes, int pasajeros,
                                          int paquetes10, int paquetes10y20, int paquetesMas20) {
        int kilometro = 0;

        switch (ruta) {// cambio de rutas
            case 1:
                kilometro = viajes * 150;
                break;
            case 2:
                kilometro = viajes * 167;
                break;
            case 3:
                kilometro = viajes * 184;
                break;
            case 4:
                kilometro = viajes * 203;
                break;

        }
        int consumo = (int) (kilometro / 39 * 8.860); // kilometro/ rendimiento por km del camion (39Km) * precio del galon
        int peso = pasajeros * 60
                + paquetes10 * 10
                + paquetes10y20 * 15
                + paquetesMas20 * 20;

        if(peso>5000 && peso<=1000){
            consumo=(int)(consumo*1.1);
        }else if (peso>1000){
            consumo=(int)(consumo*1.25);
        }
        return (int)(consumo*0.75);

    }
}
