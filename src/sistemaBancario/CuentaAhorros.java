package sistemaBancario;

public class CuentaAhorros extends CuentaBancaria {
    public CuentaAhorros(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public double calcularInteresMensual() {
        double tasaAnual = 0.03;
        return getSaldo() * (tasaAnual / 12);
    }
}
