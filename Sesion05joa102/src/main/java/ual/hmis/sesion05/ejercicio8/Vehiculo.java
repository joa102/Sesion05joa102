package ual.hmis.sesion05.ejercicio8;

public class Vehiculo {
	
	private int numPasajeros;
	private int numRuedas;
	private double pesoVehiculo;
	
	public Vehiculo () {}
	
	public Vehiculo (int numPasajeros, double pesoVehiculo) {
		this.numPasajeros = numPasajeros;
		this.pesoVehiculo = pesoVehiculo;
	}
	
	public int getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public double getPesoVehiculo() {
		return pesoVehiculo;
	}
	public void setPesoVehiculo(double peso) {
		this.pesoVehiculo = peso;
	}
	
	

}
