package ual.hmis.sesion05.ejercicio4;

public class Ejercicio4 {
	
	public String cadena(String p1,String p2) {

		String resultado = "";	
		for(int i = 0; i < p1.length(); i++){
			if(p2.contains(String.valueOf(p1.charAt(i))) == true)
					resultado += p1.charAt(i);
		}
		
		return resultado;
	}

}
