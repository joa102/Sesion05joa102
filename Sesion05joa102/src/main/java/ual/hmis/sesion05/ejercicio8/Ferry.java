package ual.hmis.sesion05.ejercicio8;

import java.util.ArrayList;

public class Ferry {
	
	//ArrayList<String> listaPasajeros = new ArrayList<String>();
	private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
	
	private int maxPasajeros;
	private int maxVehiculos;
	private double maxPesoVehiculos;
	private int totalParajeros;
	private int totalVehiculos;
	private double pesoTotalVehiculos;
	
	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}
	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	public int getMaxPasajeros() {
		return maxPasajeros;
	}
	public void setMaxPasajeros(int maxPasajeros) {
		this.maxPasajeros = maxPasajeros;
	}
	public int getMaxVehiculos() {
		return maxVehiculos;
	}
	public void setMaxVehiculos(int maxVehiculos) {
		this.maxVehiculos = maxVehiculos;
	}
	public double getMaxPesoVehiculos() {
		return maxPesoVehiculos;
	}
	public void setMaxPesoVehiculos(double maxPesoVehiculos) {
		this.maxPesoVehiculos = maxPesoVehiculos;
	}
	public int getTotalParajeros() {
		return totalParajeros;
	}
	
	public void setTotalParajeros(int totalParajeros) {
		this.totalParajeros = totalParajeros;
	}
	public int getTotalVehiculos() {
		return totalVehiculos;
	}
	public void setTotalVehiculos(int totalVehiculos) {
		this.totalVehiculos = totalVehiculos;
	}
	public double getPesoTotalVehiculos() {
		return pesoTotalVehiculos;
	}
	public void setPesoTotalVehiculos(double pesoTotalVehiculos) {
		this.pesoTotalVehiculos = pesoTotalVehiculos;
	}

	boolean embarcarVehiculo (Vehiculo v) {
		// Embarca un vehículo añadiéndolo a la lista
		
		if ((superadoMaximoVehiculos() && superadoMaximoPeso(v.getPesoVehiculo())) == false) {
			listaVehiculos.add(v);
			return true;
		} else {
			return false;
		}
	}
	
	int totalVehiculos() {
		// devuelve el número total de vehículos embarcados 
		
		setTotalVehiculos(listaVehiculos.size());
		
		return listaVehiculos.size();
	}
	
	boolean vacio() {
		// verdadero si no hay ningún vehículo
		
		if (listaVehiculos.isEmpty())
			return true;
		else
			return false;
	}

	boolean superadoMaximoVehiculos() {
		// verdadero si el número total de los vehículos supera el máximo
		
		if ((totalVehiculos() + 1) > maxVehiculos)
			return true;
		else
			return false;
	}
	
	boolean superadoMaximoPeso(double pesoVehiculo) {
		// verdadero si el peso total de los vehículos supera el máximo
		
		if ((pesoTotalVehiculos + pesoVehiculo) > maxPesoVehiculos)
			return true;
		else
			return false;
	}
	
}
