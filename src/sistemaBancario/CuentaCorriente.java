package sistemaBancario;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public void retirar(double monto) {
        double limiteSobregiro = 500;
        if (monto <= 0) {
            System.out.println("Error, el monto debe ser mayor a cero.");
            return;
        }
        if (monto > getSaldo() + limiteSobregiro) {
            System.out.println("Error, supera el límite de sobregiro de $");
            return;
        }
        setSaldo(getSaldo() - monto);
        System.out.println("Retiro exitoso. Nuevo saldo: " + getSaldo());
    }

    @Override
    public double calcularInteresMensual() {
        return 0;
    }
}
