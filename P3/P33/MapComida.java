package mx.unam.fi.poo.g1.p56.p33;
import java.util.HashMap;
/**
 * Clase ListaComida
 * 
 * @author Grupo 1 POO Sánchez Salazar Jazmin
 * @version Septiembre-2024
 * 
 */
/**
 * Clase Hashmap de comidas.
 */
public class MapComida {
    private HashMap<String, Integer> mapa;

    /**
     * Método Constructor
     * inicializa el objeto mapa de comidas.
     */
    public MapComida() {
        this.mapa = new HashMap<>();
    }

    /**
     * Método set
     * 
     * @param mapa -> Atributo para el nuevo mapa de comidas a asignar.
     */
    public void setMapa(HashMap<String, Integer> mapa) {
        this.mapa = mapa;
    }

    /**
     * Método get
     * 
     * @return El mapa de comidas.
     */
    public HashMap<String, Integer> getMapa() {
        return mapa;
    }
    
}
