package ual.hmis.sesion05.ejercicio9;

import java.util.Arrays;

/**
 * @author Juandi
 *
 */
public class Ejercicio9 {

    /**
     * @param c1
     * @param c2
     * @return SortedString
     */
    public String listaCadenasOrdenadas(final String c1, final String c2) {

        String cadena = c1 + c2;

        char[] stringtoChar = cadena.toCharArray();
        Arrays.sort(stringtoChar);
        String sortedString = new String(stringtoChar);

        return sortedString;
    }

}
