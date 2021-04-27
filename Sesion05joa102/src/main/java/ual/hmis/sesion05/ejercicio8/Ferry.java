package ual.hmis.sesion05.ejercicio8;

import java.util.ArrayList;

public class Ferry {

    // ArrayList<String> listaPasajeros = new ArrayList<String>();
    /**
     * listaVehiculos.
     */
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
    /**
     * maxPasajeros.
     */
    private int maxPasajeros;
    /**
     * maxVehiculos.
     */
    private int maxVehiculos;
    /**
     * maxPesoVehiculos.
     */
    private double maxPesoVehiculos;
    /**
     * totalParajeros.
     */
    private int totalParajeros;
    /**
     * totalVehiculos.
     */
    private int totalVehiculos;
    /**
     * pesoTotalVehiculos.
     */
    private double pesoTotalVehiculos;

//    public ArrayList<Vehiculo> getListaVehiculos() {
//        return listaVehiculos;
//    }

    /**
     * @param listVehiculos
     */
    public void setListaVehiculos(final ArrayList<Vehiculo> listVehiculos) {
        this.listaVehiculos = listVehiculos;
    }

    /**
     * @return maxPasajeros
     */
    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    /**
     * @param mxPasajeros
     */
    public void setMaxPasajeros(final int mxPasajeros) {
        this.maxPasajeros = mxPasajeros;
    }

//    public int getMaxVehiculos() {
//        return maxVehiculos;
//    }

    /**
     * @param mxVehiculos
     */
    public void setMaxVehiculos(final int mxVehiculos) {
        this.maxVehiculos = mxVehiculos;
    }

//    public double getMaxPesoVehiculos() {
//        return maxPesoVehiculos;
//    }

    /**
     * @param mxPesoVehiculos
     */
    public void setMaxPesoVehiculos(final double mxPesoVehiculos) {
        this.maxPesoVehiculos = mxPesoVehiculos;
    }

    /**
     * @return totalParajeros
     */
    public int getTotalParajeros() {
        return totalParajeros;
    }

//    public void setTotalParajeros(int totalParajeros) {
//        this.totalParajeros = totalParajeros;
//    }

    /**
     * @return totalVehiculos
     */
    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    /**
     * @param totVehiculos
     */
    public void setTotalVehiculos(final int totVehiculos) {
        this.totalVehiculos = totVehiculos;
    }

//    public double getPesoTotalVehiculos() {
//        return pesoTotalVehiculos;
//    }

//    public void setPesoTotalVehiculos(double pesoTotalVehiculos) {
//        this.pesoTotalVehiculos = pesoTotalVehiculos;
//    }

    /**
     * @param v
     * @return boolean
     */
    boolean embarcarVehiculo(final Vehiculo v) {
        // Embarca un vehículo añadiéndolo a la lista

        if (superadoMaximoVehiculos()
                && superadoMaximoPeso(v.getPesoVehiculo())) {
            return false;
        } else {
            listaVehiculos.add(v);
            return true;
        }
    }

    /**
     * @return listaVehiculos.size()
     */
    int totalVehiculos() {
        // devuelve el número total de vehículos embarcados

        setTotalVehiculos(listaVehiculos.size());

        return listaVehiculos.size();
    }

    /**
     * @return boolean
     */
    boolean vacio() {
        // verdadero si no hay ningún vehículo

        return listaVehiculos.isEmpty();
    }

    /**
     * @return boolean
     */
    boolean superadoMaximoVehiculos() {
        // verdadero si el número total de los vehículos supera el máximo

        return (totalVehiculos() + 1) > maxVehiculos;
    }

    /**
     * @param pesoVehiculo
     * @return boolean
     */
    boolean superadoMaximoPeso(final double pesoVehiculo) {
        // verdadero si el peso total de los vehículos supera el máximo

        return (pesoTotalVehiculos + pesoVehiculo) > maxPesoVehiculos;
    }

}
