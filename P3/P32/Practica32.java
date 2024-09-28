package mx.unam.fi.poo.g1.p56.p32;

import mx.unam.fi.poo.g1.p56.p32.ListaComida;
import mx.unam.fi.poo.g1.p56.p32.CambiarComida;

/**
 * Clase Practica32 que utiliza ListaComida para cambiar una lista de comidas.
 */
public class Practica32 {
     /**
    * Método principal que inicia la ejecución de la aplicación.
    * 
    * @param args Argumentos de línea de comandos.
    */
    public static void main(String[] args) {
        ListaComida lista = new ListaComida();
        CambiarComida modificar = new CambiarComida(lista,1,"Sushi");

        lista.agregarComida("Pozole");
        lista.agregarComida("Sopes");
        lista.agregarComida("Enchiladas");
        lista.agregarComida("Tacos");
        lista.agregarComida("Tinga");

        System.out.println("La lista original es: " + lista.getListaComida());

        modificar.CambiarComida(lista, 1, "Sushi");

        System.out.println("La lista modificada es: " + lista.getListaComida());
    }
}
