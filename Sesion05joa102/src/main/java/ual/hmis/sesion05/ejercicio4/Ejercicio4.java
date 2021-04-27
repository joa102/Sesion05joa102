package ual.hmis.sesion05.ejercicio4;

/**
 * @author Juandi
 *
 */
public class Ejercicio4 {

    /**
     * @param p1
     * @param p2
     * @return resultado
     */
    public String cadena(final String p1, final String p2) {

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < p1.length(); i++) {
            if (p2.contains(String.valueOf(p1.charAt(i)))) { // == true
                resultado.append(p1.charAt(i));
            }
        }

        return resultado.toString();
    }

}
