package mx.unam.fi.poo.g1.p56.p31;
import mx.unam.fi.poo.g1.p56.p31.CambiarCad;
/**
 * Clase Practica 31 para Cambiar caracteres específicos
*/

public class Practica31 {
     /**
    * Método principal que inicia la ejecución de la aplicación.
    * 
    * @param args Argumentos de línea de comandos.
    */
    public static void main(String[] args) {
    CambiarCad cambio = new CambiarCad("Yo como muchos dulces");
    System.out.println("La cadena sin modificar es: " + cambio.getCad());

    System.out.println("La cadena después de reemplazar las 'Y' por 'N' es: ");
    System.out.println(cambio.Reemplazar('Y', 'N'));
    }
    
    
}
