
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
            this.ingresosMensuales = 470; // Valor por defecto mínimo
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
}
