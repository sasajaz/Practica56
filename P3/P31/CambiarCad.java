package mx.unam.fi.poo.g1.p56.p31;
/**
 * Clase CambiarCad
 * 
 * @author Grupo 1 POO Sánchez Salazar Jazmin
 * @version Septiembre-2024
 * 
 */
/**
 * Clase para CambiarCad
 */
public class CambiarCad {
    private String cad;

    /**
     * Método Constructor 
     * Para inicializar la cadena.
     * 
     * @param cad -> Atributo para la cadena que se quiere modificar.
     */
    public CambiarCad(String cad) {
        this.cad = cad;
    }
    /**
     * Método set
     * 
     * @param cad -> Para asignar la nueva cadena
     */
    public void setCad(String cad) {
        this.cad= cad;
    }
    /**
     * Método get
     * 
     * @return -> Regresa el valor de cad original.
     */
    public String getCad() {
        return cad;
    }

    /**
     * Método para reemplazar un carácter por otro en la cadena.
     * 
     * @param cadO El carácter que será reemplazado.
     * @param cadR El carácter con el cual reemplazar.
     * @return La cadena después del reemplazo.
     */
    public String Reemplazar(char cadO, char cadR) {
        return cad.replace(cadO, cadR);
    }
}
