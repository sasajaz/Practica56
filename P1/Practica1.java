package mx.unam.fi.poo.g1.p56.p1;

import java.util.Scanner;
import mx.unam.fi.poo.g1.p56.p1.Distancia;
/**
 * Clase Practica 1 para intercambiar comunicacion con el ususario y calcular la distancia entre dos puntos de la tierra
*/

public class Practica1 {
    /**
    * Método principal que inicia la ejecución de la aplicación.
    * 
    * @param args Argumentos de línea de comandos.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Distancia calculadora = new Distancia(0,0,0,0);

        System.out.println("Ingresa la latitud y longitud en radianes:");

        // Solicitamos las coordenadas al usuario y las asignamos usando los métodos set
        System.out.print("Ingresa la latitud x1: ");
        calculadora.setLat1(entrada.nextDouble());

        System.out.print("Ingresa la longitud y1: ");
        calculadora.setLong1(entrada.nextDouble());

        System.out.print("Ingresa la latitud x2: ");
        calculadora.setLat2(entrada.nextDouble());

        System.out.print("Ingresa la longitud y2: ");
        calculadora.setLong2(entrada.nextDouble());

        entrada.close(); // Cerramos el recurso Scanner

        // Calculamos y mostramos la distancia
        double distancia = calculadora.CalcDis();
        System.out.printf("d= %f km \n", distancia);
    }
}
