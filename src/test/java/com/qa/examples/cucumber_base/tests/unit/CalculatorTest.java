package com.qa.examples.cucumber_base.tests.unit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.examples.cucumber_base.Calculator;

public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void init() {
		this.calculator = new Calculator();
	}

	@Test
	public void addTest() {
		double expected = 10.6;
		double actual = calculator.add(4.3, 6.3);

		assertEquals(expected, actual, 7);
	}

	@Test
	public void subtractTest() {
		double expected = -2.0;
		double actual = calculator.subtract(2.0, 4.0);

		assertEquals(expected, actual, -2);
	}

	@Test
	public void multiplicationTest() {
		double expected = -2.0;
		double actual = calculator.multiply(2.0, -1.0);

		assertEquals(expected, actual, -2);
	}

	@Test
	public void divisionTest() {
		double expected = -2.0;
		double actual = calculator.divide(2.0, -1.0);

		assertEquals(expected, actual, -2);
	}
}
