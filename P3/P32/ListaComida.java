package mx.unam.fi.poo.g1.p56.p32;
import java.util.ArrayList;
/**
 * Clase ListaComida
 * 
 * @author Grupo 1 POO Sánchez Salazar Jazmin
 * @version Septiembre-2024
 * 
 */
/**
 * Clase que ListaComida.
 */
public class ListaComida {
    private ArrayList<String> comida;

    /**
     * Método Constructor para la lista de comida.
     * 
     */
    public ListaComida() {
        this.comida = new ArrayList<>();
    }
    /**
     * Método set
     * 
     * @param comida -> Para asignar la nueva lista de comida
     */
    public void setListaComida(ArrayList<String> comida) {
        this.comida = comida;
    }
    /**
     * Método get
     * 
     * @return -> Regresa la lista obtenida.
     */
    public ArrayList<String> getListaComida() {
        return comida;
    }
    /**
     * Método para agregar comida a la lista
     * @param comida -> comidas agregagadas a la lista
     */
    public void agregarComida(String comida) {
        this.comida.add(comida);
    }
}