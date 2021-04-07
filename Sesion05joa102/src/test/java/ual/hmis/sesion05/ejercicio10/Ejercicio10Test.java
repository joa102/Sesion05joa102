package ual.hmis.sesion05.ejercicio10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio10.Ejercicio10;

public class Ejercicio10Test {
	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	/*@CsvSource({"\"2\", 2",
				"\"10\", 10",
				"\"6\", 6",
				"\"14\", 14"})*/
	@CsvSource({"-2000, -2000",
				"1000, 1000",
				"32767, 32767",
				"-32768, -32768",
				"32768, 40004",
				"-32769, 40004",
				"h0l4, 40004",
				"hola, 40004"})
	
	void testTransformar(String input, int expected) {
		Ejercicio10 c = new Ejercicio10();
		assertEquals(expected, c.convertirCadenaEntero(input));
	}

}
