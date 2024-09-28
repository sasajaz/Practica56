package mx.unam.fi.poo.g1.p56.p4;
import mx.unam.fi.poo.g1.p56.p4.CuentaBanco;
/**
 * Clase Practica 4 para la cuenta de banco
*/
public class Practica4 {
    /**
   * Método principal que inicia la ejecución de la aplicación.
   * 
   * @param args Argumentos de línea de comandos.
   */
    public static void main(String[] args) {
    CuentaBanco c1 = new CuentaBanco("Jazmin Sánchez", 12325, 1000);
    CuentaBanco c2 = new CuentaBanco("Azalea Salazar", 31786, 3000);

    System.out.println("\nInformación de la cuenta: ");
    c1.imprimirCuenta();
    c2.imprimirCuenta();

    c1.DepositarDinero(500);
    c2.DepositarDinero(60);
    
    System.out.println("\nInformación de la cuenta después del depósito: ");
    c1.imprimirCuenta();
    c2.imprimirCuenta();

    c1.RetirarDinero(300);
    c2.RetirarDinero(500);

    System.out.println("\nInformación de la cuenta después del retiro: ");
    c1.imprimirCuenta();
    c2.imprimirCuenta();

    }
}
    

