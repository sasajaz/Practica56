package mx.unam.fi.poo.g1.p56.p2;
import java.util.Scanner;
/**
 * Clase SolicitarFilas
 * 
 * @author Grupo 1 POO Sánchez Salazar Jazmin
 * @version Septiembre-2024
 * 
 */
/**
 * Clase para solicitar el número de filas al usuario
 */
public class SolicitarFilas {
    private int filas;
    /**
     * Constructor sin parámetros para inicializar filas.
     */
    public SolicitarFilas() {
        
    }
    /**
     * Método Constructor
     * Para construir objetos SolicitarFilas
     * 
     * @param filas -> Atributo para número de filas.
     */
    public SolicitarFilas(int filas) {
        setFilas(filas);
    }
     /**
     * Método set
     * 
     * @param filas -> Para asignar valor a filas
     */
    public void setFilas(int filas) {
        this.filas = filas;
    }
    /**
     * Método get
     * 
     * @return -> Regresa el valor de filas.
     */
    public int getFilas() {
        return filas;
    }
     /**
     * Método para solicitar filas al usuario
     * 
     * @return número de filas
     */
    public int NumFilas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas que tendrá el triángulo de Pascal: ");
        int filas = scanner.nextInt();        
        scanner.close();
        return filas;  
    }
    

    
}
