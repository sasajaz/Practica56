package mx.unam.fi.poo.g1.p56.p33;

import mx.unam.fi.poo.g1.p56.p33.MapComida;

/**
 * Clase para buscar una comida en el mapa.
 */
public class BuscarComida {
    private MapComida mapa;
    private String llave;
    /**
     * Método constructor
     * @param mapa
     * @param llave
     * @return
     */
    /**
     * Método set
     * @param mapa -> Atributo que define el mapa de comidas donde se buscará
     * @param llave -> Atributo qeu define el nombre de la llave que se buscará
     * @return -> Atributo del valor asociado a la llave
     */

     /**
     * Método get para obtener el mapa.
     * 
     * @return el mapa.
     */
    public MapComida getMapa() {
        return this.mapa;
    }
     /**
     * Método get para obtener la llave.
     * 
     * @return llave de la comida.
     */
    public String getLlave() {
        return this.llave;
    }
     /**
     * Método get para obtener valor asociado a la llave.
     * 
     * @return llave de la comida.
     */

    /**
     * Método para buscar una comida en el mapa.
     * 
     * @param mapa El mapa de comidas donde se realizará la búsqueda.
     * @param llave El nombre de la comida que se desea buscar.
     * @return El valor asociado a la llave
     */
    public Integer buscarComida(MapComida mapa, String llave) {
        return mapa.getMapa().get(llave); 
    }
}
