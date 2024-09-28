package mx.unam.fi.poo.g1.p56.p4;
/**
 * Clase CuentaBanco
 * 
 * @author Grupo 1 POO Sánchez Salazar Jazmin
 * @version Septiembre-2024
 * 
 */
/**
 * Clase que CuentaBanco.
 */
public class CuentaBanco {
    private String nombre;
    private int cuenta;
    private double depositoInicial;
    /**
     * Método Constructor 
     * para la CuentaBanco
     * @param nombre ->Atributo para el nombre del titutal
     * @param cuenta -> Atributo para el numero de cuenta
     * @param depositoInicial -> Atributo para el saldo 
     */
    public CuentaBanco(String nombre, int cuenta, double depositoInicial) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.depositoInicial = depositoInicial;
    }
    /**
     * Método set
     * 
     * @param nombre -> Para asignar el nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método set
     * 
     * @param cuenta -> Para asignar la número de cuenta 
     */
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Método set
     * 
     * @param depositoInicial -> Para asignar un deposito inicial a la cuenta
     */
    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }
    /**
     * Método get
     * 
     * @return -> El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método get
     * 
     * @return -> El numero de la cuenta.
     */
    public int getCuenta() {
        return cuenta;
    }
    /**
     * Método get
     * 
     * @return -> El saldo de la cuenta.
     */
    public double getDepositoInicial() {
        return depositoInicial;
    }
    /**
     * Método para depositar el dinero en la cuenta.
     * @param deposito La cantidad a depositar.
     */
    public void DepositarDinero(double deposito) {
        this.depositoInicial += deposito;
    }

    /**
     * Método para retirar dinero de la cuenta.
     * @param retiro El monto que se va a retirar.
     */
    public void RetirarDinero(double retiro) {
        this.depositoInicial -= retiro;
    }

    /**
     * Método para mostrar la información de la cuenta bancaria.
     */
    public void imprimirCuenta() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cuenta: " + cuenta);
        System.out.println("Depósito Inicial: " + depositoInicial);
    }
}
