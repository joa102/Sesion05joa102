package ual.hmis.sesion05.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio9.Ejercicio9;

public class Ejercicio9Test {
	
	@ParameterizedTest (name = "{index} => Con entradas p1 ({0}) y p2 ({1}) sale {2}")
	@CsvSource({"'db', 'ca', 'abcd'",
				"'hola', 'joaquin', 'aahijlnooqu'",
				"'soy', 'juandi', 'adijnosuy'",
				"'', '', ''"})
	
	void testListaCadenasOrdenadas(String c1, String c2, String expected) {
		Ejercicio9 e9 = new Ejercicio9();
		assertEquals(expected, e9.listaCadenasOrdenadas(c1, c2));
	}

}
