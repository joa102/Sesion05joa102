package ual.hmis.sesion05.ejercicio8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import ual.hmis.sesion05.ejercicio8.Ferry;
import ual.hmis.sesion05.ejercicio8.Vehiculo;

public class Ejercicio8Test {

	@ParameterizedTest
	@MethodSource("embarcarVehiculoProvider")
	void testEmbarcar(Ferry f, Vehiculo v, Boolean expected) {
		assertEquals(expected, f.embarcarVehiculo(v));
	}

	static Stream<Arguments> embarcarVehiculoProvider() {
		Ferry f = new Ferry();
		f.setMaxPasajeros(9);
		f.setMaxPesoVehiculos(10.0);
		f.setMaxVehiculos(3);
		f.setListaVehiculos(new ArrayList<Vehiculo>() {
			{
				add(new Vehiculo(1, 1.5));
				add(new Vehiculo(1, 1.5));
				add(new Vehiculo(1, 1.5));
				add(new Vehiculo(1, 1.5));
				add(new Vehiculo(1, 1.5));
				add(new Vehiculo(1, 1.5));
				add(new Vehiculo(1, 1.5));
				add(new Vehiculo(1, 1.5));
				add(new Vehiculo(1, 1.5));
				add(new Vehiculo(1, 1.5));
			}
		});

		return Stream.of(
				Arguments.of(f, new Vehiculo(1, 1.5), true),
				Arguments.of(f, new Vehiculo(9, 10.0), true),
				Arguments.of(f, new Vehiculo(10, 10.5), false),
				Arguments.of(f, new Vehiculo(4, 10.5), false)
		);
	}

}
