package ual.hmis.sesion05.ejercicio2;

/**
 * @author Juandi
 *
 */
public class Ejercicio2 {

    /**
     * @param username
     * @param password
     * @return compruebaLoginEnBD
     */
    public boolean login(final String username, final String password) {

        final int x1 = 30;

        // comprobar que sean distintos de vacio
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }

        // comprobar que la longitud sea < 30
        if (username.length() >= x1 || password.length() >= x1) {
            return false;
        }

        // comprobar que el password tenga al menos una letra mayúscula,
        // una minúscula y un dígito
        int countUC = 0;
        int countLC = 0;
        int countD = 0;

        for (int i = 0; i < password.length(); i++) {

            if (Character.isUpperCase(password.charAt(i))) {
                countUC++;
            }

            if (Character.isLowerCase(password.charAt(i))) {
                countLC++;
            }

            if (Character.isDigit(password.charAt(i))) {
                countD++;
            }

        }

        if (countUC < 1 || countLC < 1 || countD < 1) {
            return false;
        }

        // llamar al método de la bbdd
        return compruebaLoginEnBD(username, password);
    }

    /**
     * @param username
     * @param password
     * @return boolean
     */
    public boolean compruebaLoginEnBD(final String username,
            final String password) {
        /*
         * if (username.equals("user") && password.equals("Pass1")) {
         *  return true;
         * }
         * else {
         *  return false;
         *  }
         */
        // método mock (simulado)
        return username.equals("user") && password.equals("Pass1");
    }
}
