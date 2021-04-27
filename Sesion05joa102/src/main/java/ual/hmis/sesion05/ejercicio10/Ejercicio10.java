package ual.hmis.sesion05.ejercicio10;

/**
 * @author Juandi
 *
 */
public class Ejercicio10 {

    /**
     * @param c
     * @return c
     */
    public int convertirCadenaEntero(final String c) {
        final int x0 = -32768;
        final int x1 = 32767;
        final int x2 = 40004;
        boolean isNumeric = c.matches("[+-]?\\d*(\\.\\d+)?");
        int i = 0;
        if (isNumeric) { // == true
            i = Integer.parseInt(c);
            // i = Integer.valueOf(c);
            if (i >= x0 && i <= x1) {
                return i;
            } else {
                return x2;
            }
        } else {
            return x2;
        }
    }
}
