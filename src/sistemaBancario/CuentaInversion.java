package sistemaBancario;

public class CuentaInversion extends CuentaBancaria {
    public CuentaInversion(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public double calcularInteresMensual() {
        double tasaAnual;
        if (getSaldo() < 1000) tasaAnual = 0.04;
        else if (getSaldo() <= 5000) tasaAnual = 0.05;
        else tasaAnual = 0.06;
        return (getSaldo() * tasaAnual) / 12;
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
        }
    }

}
