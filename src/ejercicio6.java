import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Pedimos datos de entrada

        System.out.println("Introduce el nombre: ");
        String name= sc.nextLine();

        System.out.println("Ingrese horas trabajadas: ");
        int hour= sc.nextInt();

        System.out.println("Ingrese valor de las horas: ");
        int hourVal= sc.nextInt();

        System.out.println("Ingrese valor del salario minimo: ");
        int minSalary= sc.nextInt();

        int salary= hour*hourVal;

        if (salary>minSalary){

            System.out.println("nombre "+name);
            System.out.println("salario "+salary);
        }else {
            System.out.println("nombre "+name);}

    }
}
