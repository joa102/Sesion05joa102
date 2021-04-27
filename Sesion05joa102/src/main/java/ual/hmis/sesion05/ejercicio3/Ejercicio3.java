package ual.hmis.sesion05.ejercicio3;

/**
 * @author Juandi
 *
 */
public class Ejercicio3 {
    /**
     * 0.
     */
    private final int x0 = 0;
    /**
     * x3.
     */
    private final int x5 = 5;
    /**
     * x5.
     */
    private final int x12 = 12;

    /**
     * @param x
     * @return resultado
     */
    public String cadena(final int x) {

        String resultado = "";

        if (x < x0) {
            return "numero erroneo";
        } else {

            int valor = x;

            if (x < x5) {
                valor = x5;
            } else if (x > x12) {
                valor = x12;
            }

            for (int i = x0; i < valor; i++) {
                resultado += "*";
            }
        }
        return resultado;
    }
}
