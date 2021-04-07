package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio4.Ejercicio4;

public class Ejercicio4Test {
	
	@ParameterizedTest (name = "{index} => Con entradas p1 ({0}) y p2 ({1}) sale {2}")
	@CsvSource({"'repera', 'pera', 'repera'",
				"'hola', 'ola', 'ola'",
				"'mola', '', ''",
				"'', 'lola', ''"})
	
	void testCadena(String p1, String p2, String expected) {
		Ejercicio4 e4 = new Ejercicio4();
		assertEquals(expected, e4.cadena(p1, p2));
	}
	
}
