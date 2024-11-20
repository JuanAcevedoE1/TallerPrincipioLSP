package TallerPrincipioLSP.LSP2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaAhorros(1000, 0.05);

        cuenta.depositar(200);
        System.out.println("Saldo después del depósito: " + cuenta.getSaldo());

        cuenta.retirar(500);
        System.out.println("Saldo después de la retirada: " + cuenta.getSaldo());

        ((CuentaAhorros) cuenta).aplicarInteres();
        System.out.println("Saldo después de aplicar interés: " + cuenta.getSaldo());
    }
}