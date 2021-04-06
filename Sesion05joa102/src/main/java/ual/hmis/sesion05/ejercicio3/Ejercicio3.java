package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {
	
	public String cadena(int x) {
		
		String resultado="";
		
		if (x < 0) {
			return "numero erroneo";
		} else {
			
			int valor = x;
			
			if (x < 5)
				valor = 5;
			else if (x > 12)
				valor = 12;
			
			for (int i = 0; i < valor; i++)
				resultado+="*";
		}		
		return resultado;
	}
}
