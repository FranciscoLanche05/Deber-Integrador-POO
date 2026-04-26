package sistemaBancario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CuentaBancaria> cuentas = new ArrayList<>();


        cuentas.add(new CuentaAhorros("SAV-001", "Ana Pérez", 1200));
        cuentas.add(new CuentaCorriente("CUR-002", "Luis Gómez", 800));
        cuentas.add(new CuentaInversion("INV-003", "María López", 7000));

        double totalInteresesBanco = 0;

        System.out.println("===== REPORTE MENSUAL DEL BANCO =====");
        for (CuentaBancaria c : cuentas) {
            double interes = c.calcularInteresMensual();
            totalInteresesBanco += interes;

            System.out.println("Titular: " + c.getTitular());
            System.out.println("Interés generado: $" + String.format("%.2f", interes));
            System.out.println("Saldo actualizado: $" + String.format("%.2f", (c.getSaldo() + interes)));
            System.out.println("-------------------------------------");
        }

        System.out.println("TOTAL INTERESES A PAGAR POR EL BANCO: $" + String.format("%.2f", totalInteresesBanco));
    }
}