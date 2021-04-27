package ual.hmis.sesion05.ejercicio10;

/**
 * @author Juandi
 *
 */
public class Ejercicio10 {
    /**
     * -32767.
     */
    private final int x0 = -32768;
    /**
     * 32767.
     */
    private final int x1 = 32767;
    /**
     * 40004.
     */
    private final int x2 = 40004;

    /**
     * @param c
     * @return c
     */
    public int convertirCadenaEntero(final String c) {
        boolean isNumeric = c.matches("[+-]?\\d*(\\.\\d+)?");
        int i = 0;
        if (isNumeric) { // == true
            // i = Integer.parseInt(c);
            i = Integer.valueOf(c);
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
