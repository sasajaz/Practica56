package mx.unam.fi.poo.g1.p56.p33;

import java.util.HashMap;
import mx.unam.fi.poo.g1.p56.p33.MapComida;

/**
 * Clase ComidasMap.
 */
public class ComidasMap {
    private MapComida mapa;
    private String comida;
    private int valor;
    /**
     * Constructor sin parámetros.
     */
    public ComidasMap() {
        this.mapa = new MapComida();
        this.comida = "";
        this.valor = 0;
    }
    /**
     * Método constructor
     * Para inicializar los  objetos ComidasMap
     * @param mapa ->Atributo para el mapa de comidas
     * @param comida ->Atributo para el nombre de la comida
     * @param valor -> Atributo para el valor asociado a la comida
     */
    public ComidasMap(MapComida mapa, String comida, int valor) {
        this.mapa=mapa;
        this.comida=comida;
        this.valor=valor;
    }
    /**
     * Método set
     * @param mapa ->Atributo para el mapa de comidas
     * @param comida ->Atributo para el nombre de la comida
     * @param valor -> Atributo para el valor asociado a la comida
     */
    public void SetComidas(MapComida mapa, String comida, int valor) {
        this.mapa=mapa;
        this.comida=comida;
        this.valor=valor;
    }
    /**
     * Método get
     * 
     * @return el mapa de comidas.
     */
    public MapComida getMapa() {
        return this.mapa;
    }

    /**
     * Método get 
     * 
     * @return La nueva comida.
     */
    public String getComida() {
        return this.comida;
    }

    /**
     * Método get 
     * 
     * @return el valor.
     */
    public int getValor() {
        return this.valor;
    }
    /**
     * Método para agregar una comida al mapa.
     * 
     * @param mapa El mapa de comidas donde se agregará la comida.
     * @param comida El nombre de la comida.
     * @param valor El valor asociado a la comida.
     */
    public void agregarComida(MapComida mapa, String comida, int valor) {
        HashMap<String, Integer> mapaInterno = mapa.getMapa();
        mapaInterno.put(comida, valor);
        mapa.setMapa(mapaInterno);
    }
}

