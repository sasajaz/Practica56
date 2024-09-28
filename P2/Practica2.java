package mx.unam.fi.poo.g1.p56.p2;
import java.util.Scanner;

import mx.unam.fi.poo.g1.p56.p2.FormarTriangulo;
import mx.unam.fi.poo.g1.p56.p2.SolicitarFilas;
/**
 * Clase Practica 2 para solicitar filas e imprimir triangulo de pascal
*/
public class Practica2 {
    /**
    * Método principal que inicia la ejecución de la aplicación.
    * 
    * @param args Argumentos de línea de comandos.
    */
    public static void main(String[] args) {
        SolicitarFilas entrada = new SolicitarFilas();
        int filas = entrada.NumFilas();
        FormarTriangulo triang = new FormarTriangulo(filas);
        triang.TrianP();


    }
    
}
