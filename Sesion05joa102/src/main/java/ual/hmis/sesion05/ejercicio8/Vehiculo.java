package ual.hmis.sesion05.ejercicio8;

/**
 * @author Juandi
 *
 */
public class Vehiculo {

    /**
     * numPasajeros.
     */
    private int numPasajeros;
    /**
     * numRuedas.
     */
    private int numRuedas;
    /**
     * pesoVehiculo.
     */
    private double pesoVehiculo;

//    /**
//     * Vehiculo.
//     */
//    public Vehiculo() {
//    }

    /**
     * @param nPasajeros
     * @param pVehiculo
     */
    public Vehiculo(final int nPasajeros, final double pVehiculo) {
        this.numPasajeros = nPasajeros;
        this.pesoVehiculo = pVehiculo;
    }

    /**
     * @return numPasajeros
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }

//    public void setNumPasajeros(int numPasajeros) {
//        this.numPasajeros = numPasajeros;
//    }

    /**
     * @return numRuedas
     */
    public int getNumRuedas() {
        return numRuedas;
    }

//    public void setNumRuedas(int numRuedas) {
//        this.numRuedas = numRuedas;
//    }

    /**
     * @return pesoVehiculo
     */
    public double getPesoVehiculo() {
        return pesoVehiculo;
    }

//    public void setPesoVehiculo(double peso) {
//        this.pesoVehiculo = peso;
//    }

}
