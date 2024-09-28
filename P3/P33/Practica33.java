package mx.unam.fi.poo.g1.p56.p33;

import mx.unam.fi.poo.g1.p56.p33.MapComida;
import mx.unam.fi.poo.g1.p56.p33.ComidasMap;
import mx.unam.fi.poo.g1.p56.p33.BuscarComida;

/**
 * Clase Practica33 que utiliza MapaComida para manejar un mapa de comidas.
 */
public class Practica33 {
/**
    * Método principal que inicia la ejecución de la aplicación.
    * 
    * @param args Argumentos de línea de comandos.
    */

    public static void main(String[] args) {
        // Crear las instancias necesarias
        MapComida mapaComida = new MapComida();
        ComidasMap agregar = new ComidasMap();
        BuscarComida buscar = new BuscarComida();

        // Agregar comidas al mapa
        agregar.agregarComida(mapaComida, "Pozole", 1);
        agregar.agregarComida(mapaComida, "Enchiladas", 2);
        agregar.agregarComida(mapaComida, "Sopes", 3);
        agregar.agregarComida(mapaComida, "Chilaquiles", 4);
        agregar.agregarComida(mapaComida, "Tinga", 5);

        // Mostrar el mapa original
        System.out.println("El mapa original es: " + mapaComida.getMapa());

        // Buscar una comida en el mapa
        String llave = "Enchiladas";
        System.out.println("El valor de la llave " + llave + " es: " + buscar.buscarComida(mapaComida, llave));
    }
}

