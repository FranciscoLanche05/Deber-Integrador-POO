import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SolicitanteSubsidio.mostrarReglasSubcidio();
        System.out.println("Ingrese su nombre completo: ");
        String nombre= sc.nextLine();
        System.out.println("Ingrese su cedula: ");
        String cedula = sc.nextLine();
        System.out.println("Ingrese sus ingresos mensuales: ");
        double ingresosMensuales = sc.nextDouble();
        System.out.println("Ingrese la cantidad de vehículos registrados: ");
        int cantidadVehiculos = sc.nextInt();
        System.out.println("Vive en Ecuador(True/False): ");
        boolean viveEnEcuador = sc.nextBoolean();
        SolicitanteSubsidio solicitante1 = new SolicitanteSubsidio(nombre,cedula,ingresosMensuales,cantidadVehiculos,viveEnEcuador);


        System.out.println(solicitante1.toString());
        solicitante1.generarResultado();

        double consumoBase = solicitante1.calcularConsumoMensual();
        double consumoExtra = solicitante1.calcularConsumoMensual(200);

        System.out.println("\nConsumo mensual (base): " + consumoBase + " galones");
        System.out.println("Consumo mensual (con km extra): " + consumoExtra + " galones");


    }
}