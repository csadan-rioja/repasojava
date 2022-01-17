package com.iescomercio.java.repaso.modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.iescomercio.java.repaso.modelo.Calculadora;

public class CalculadoraTest {
	
	Calculadora c = new Calculadora();

	@Test
	public void testSuma() {
		assertEquals(2, c.suma(1, 1));
	}

	@Test
	public void testResta() {
		assertEquals(2, c.resta(4,2));
	}

	@Test
	public void testDivision() {
		assertEquals(Double.valueOf(2.0), Double.valueOf(c.division(4.0, 2.0)));
	}

}
