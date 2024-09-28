package mx.unam.fi.poo.g1.p56.p32;

import java.util.ArrayList;

import mx.unam.fi.poo.g1.p56.p32.ListaComida;

/**
 * Clase para modificar un elemento en la lista de comida.
 */
public class CambiarComida {
    private ListaComida lista;
    private int posicion;
    private String nuevaComida;
    /**
     * Método constructor 
     * Para cambiar un elemento en la lista de comida.
     * 
     * @param lista -> Atributo para La lista de comida.
     * @param posicion -> Atributo para indicar el índice del elemento a cambiar.
     * @param nuevaComida -> Atributo para la nuevaComida.
     */
    public CambiarComida(ListaComida lista, int posicion, String nuevaComida) {
        this.lista = lista;
        this.posicion = posicion;
        this.nuevaComida = nuevaComida;
    }
     /**
     * Método set
     * 
     * @param lista -> Para la lista de comida
     * @param posicion -> Para la posicion en la lista
     * @param nuevaComida -> PAra la nueva comida
     */
    public void setComidas(ListaComida lista, int posicion, String nuevaComida) {
        this.lista = lista;
        this.posicion=posicion;
        this.nuevaComida= nuevaComida;
    }
    /**
     * Método get para obtener la lista de comidas.
     * 
     * @return La lista de comidas.
     */
    public ListaComida getListaComida() {
        return this.lista;
    }

    /**
     * Método get para obtener la posición de la comida.
     * 
     * @return La posición del elemento a cambiar.
     */
    public int getPosicion() {
        return this.posicion;
    }

    /**
     * Método get para obtener la nueva comida.
     * 
     * @return LA nueva comida.
     */
    public String getNuevaComida() {
        return this.nuevaComida;
    }
    /**
     * Método para Cambiar el elemento de la lista
     * @param lista -> Para la lista de comida
     * @param posicion -> Para la posicion en la lista
     * @param nuevaComida -> PAra la nueva comida
     */
    public void CambiarComida(ListaComida lista, int posicion, String nuevaComida) {
        ArrayList<String> comidas = lista.getListaComida();
        if (posicion >= 0 && posicion < comidas.size()) {
            comidas.set(posicion, nuevaComida);
            lista.setListaComida(comidas);
        } else {
            System.out.println("No existe esa posicion en la lista");
        }
    }
}

