package ual.hmis.sesion05.ejercicio1;

/**
 * @author Juandi
 *
 */
public class Ejercicio1 {

    /**
     * @param x
     * @return x
     */
    public int transformar(final int x) {

        final int x2 = 2;
        final int x3 = 3;
        final int x5 = 5;
        int resultado = 0;
        if (x % x2 == 0) {
            resultado = transformar(x / x2);
        } else if (x % x3 == 0) {
            resultado = transformar(x / x3);
        } else if (x % x5 == 0) {
            resultado = transformar(x / x5);
        } else {
            return x;
        }
        return resultado;
    }
}
