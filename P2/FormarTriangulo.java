package mx.unam.fi.poo.g1.p56.p2;
/**
 * Clase FormarTriangulo
 * 
 * @author Grupo 1 POO Sánchez Salazar Jazmin
 * @version Septiembre-2024
 * 
 */
/** 
 * Clase que genera y muestra el triángulo de Pascal.
 */
public class FormarTriangulo {
    private int f;
    /**
     * Método Constructor
     * Para construir objetos FormarTriangulo
     * 
     * @param f -> Atributo para número de filas del triangulo de Pascal.
     */  
    public FormarTriangulo(int f) {
        setF(f);

    } 
    /**
     * Método set
     * 
     * @param f -> Para asignar valor a f
     */
    public void setF(int f) {
        this.f = f;
    }
    /**
     * Método get
     * 
     * @return -> Regresa el valor de f.
     */
    public int getF() {
        return f;
    }
     /**
     * Método para imprimir el triangulo de Pascal de acuerdo al número de filas
     * 
     */
    public void TrianP() {
        for (int i = 0; i < f; i++) {
            for (int j = 1; j <= f - i; j++)
                System.out.print(" ");
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println("");

        }
    }

}
