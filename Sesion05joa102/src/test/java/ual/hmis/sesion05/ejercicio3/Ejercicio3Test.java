package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio3.Ejercicio3;

public class Ejercicio3Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"5, '*****'",
				"4, '*****'",
				"12, '************'",
				"13, '************'",
				"-1, 'numero erroneo'"})
	
	void testCadena(int input, String expected) {
		Ejercicio3 e3 = new Ejercicio3();
		assertEquals(expected, e3.cadena(input));
		// assertTrue(c.transformar(input)==expected);
	}

}