package mx.unam.fi.poo.g1.p56.p1;

/**
 * Clase Distancia
 * 
 * @author Grupo 1 POO Sánchez Salazar Jazmin
 * @version Septiembre-2024
 * 
 */
/*
 * Distancia
 */
public class Distancia {

    private static final double radio = 6371.01;
    private double lat1;
    private double lat2;
    private double long1;
    private double long2;

    /**
     * Método Constructor
     * Para construir objetos Distancia
     * 
     * @param lat1 -> Atributo para latitud en x1.
     * @param lat2 -> Atributo para latitud en x2.
     * @param long1 -> Atributo para longitud en y1.
     * @param long2 -> Atributo para longitud en y2.
     */
    public Distancia(double lat1, double lat2, double long1, double long2) {
        setLat1(lat1);
        setLat2(lat2);
        setLong1(long1);
        setLong2(long2);

    }

    /**
     * Método set
     * 
     * @param lat1 -> Para asignar valor a lat1
     */
    public void setLat1(double lat1) {
        this.lat1 = lat1;
    }

    /**
     * Método set
     * 
     * @param lat2 -> Para asignar valor a lat2
     */
    public void setLat2(double lat2) {
        this.lat2 = lat2;
    }

    /**
     * Método set
     * 
     * @param long1 -> Para asignar valor a long1
     */
    public void setLong1(double long1) {
        this.long1 = long1;
    }

    /**
     * Método set
     * 
     * @param long2 -> Para asignar valor a long2
     */
    public void setLong2(double long2) {
        this.long2 = long2;
    }

    /**
     * Método get
     * 
     * @return -> Regresa el valor de lat1.
     */
    public double getLat1() {
        return lat1;
    }

    /**
     * Método get
     * 
     * @return -> Regresa el valor de lat2.
     */
    public double getLat2() {
        return lat2;
    }

    /**
     * Método get
     * 
     * @return -> Regresa el valor de long1.
     */
    public double getLong1() {
        return long1;
    }

    /**
     * Método get
     * 
     * @return -> Regresa el valor de long2.
     */
    public double getLong2() {
        return long2;
    }

    /**
     * Método para calcular la distancia entre dos puntos de la tierra dadas sus
     * coordendas
     * 
     * @return distancia en km
     */
    public double CalcDis() {
        return radio * (Math
                .acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long2 - long1)));
    }
}