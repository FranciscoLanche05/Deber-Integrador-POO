package Ejercicio1;

public class SolicitanteSubsidio {

    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;


    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales,
                               int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;

        setIngresosMensuales(ingresosMensuales);
        setCantidadVehiculos(cantidadVehiculos);
        this.viveEnEcuador = viveEnEcuador;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }


    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470) {
            this.ingresosMensuales = ingresosMensuales;
        } else {
            System.out.println("Error: El ingreso mensual no puede ser menor al salario básico ($470).");
            this.ingresosMensuales = 470;
        }
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }


    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos >= 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("Error: La cantidad de vehículos no puede ser negativa.");
            this.cantidadVehiculos = 0;
        }
    }

    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }


    public boolean subsidioAprobado() {
        return (this.ingresosMensuales <= 1200 &&
                this.cantidadVehiculos <= 1 &&
                this.viveEnEcuador);
    }

    public void generarResultado() {
        if (subsidioAprobado()) {
            System.out.println("Subsidio APROBADO");
        } else {
            System.out.println("Subsidio RECHAZADO");

            if (ingresosMensuales > 1200)
                System.out.println("- Ingresos altos");

            if (cantidadVehiculos > 1)
                System.out.println("- Tiene más de un vehículo");

            if (!viveEnEcuador)
                System.out.println("- No reside en Ecuador");
        }
    }

    public static void  mostrarReglasSubcidio(){
        System.out.println("==== Reglas para ontener el subcidio ===");
        System.out.println("1. Tener ingresos mensuales menores o iguales a $1,200.");
        System.out.println("2. No poseer mas de un vehiculo registrado. ");
        System.out.println("3. Tener residencia en Ecuador. ");
        System.out.println("==========================================================\n");
    }

    double calcularConsumoMensual(){
        double kilometros  = 1000;
        return kilometros/40;
    }

    public double calcularConsumoMensual( double kmExtra){
        double Kilometros  = 1000+kmExtra;
        return Kilometros / 40;
    }

    @Override
    public String toString() {
        return "\n===== Datos del solicitante =====\n" +
                "Nombre: " + nombreCompleto + "\n" +
                "Cédula: " + cedula + "\n" +
                "Ingresos mensuales: $" + ingresosMensuales + "\n" +
                "Cantidad de vehículos: " + cantidadVehiculos + "\n" +
                "Vive en Ecuador: " + viveEnEcuador;
    }

}
