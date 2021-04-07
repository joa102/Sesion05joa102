package ual.hmis.sesion05.ejercicio10;

public class Ejercicio10 {
	
	public int convertirCadenaEntero(String c) {
		
		boolean isNumeric =  c.matches("[+-]?\\d*(\\.\\d+)?");
		
		int i = 0;
		
		if (isNumeric == true) {
			//i = Integer.parseInt(c);
			i = Integer.valueOf(c);
			if (i >= -32768 && i <= 32767)
				return i;
			else
				return 40004;
		} else
			return 40004;
	}

}
