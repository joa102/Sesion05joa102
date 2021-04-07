package ual.hmis.sesion05.ejercicio9;

import java.util.Arrays;

public class Ejercicio9 {
	
	public String listaCadenasOrdenadas(String c1,String c2) {
		
		String cadena = c1 + c2;
		
		char[] StringtoChar = cadena.toCharArray();
		Arrays.sort(StringtoChar);
        String SortedString = new String(StringtoChar);
		
		return SortedString;
	}
	
}
