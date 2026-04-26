package sistemaBancario;

public abstract class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;


    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        setSaldo(saldo);
    }


    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo invalido");
        }
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a depositar debe ser mayor a cero.");
            return;
        }
        saldo = saldo + monto;
        System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a retirar debe ser mayor a cero.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Error: saldo insuficiente.");
            return;
        }
        saldo = saldo - monto;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }


    public abstract double calcularInteresMensual();

    public void mostrarInfo() {
        System.out.println("----------------------------------");
        System.out.println("Cuenta:   " + numeroCuenta);
        System.out.println("Titular:  " + titular);
        System.out.println("Saldo:    $" + saldo);
        System.out.println("Interés mensual: $" + calcularInteresMensual());
    }
}
