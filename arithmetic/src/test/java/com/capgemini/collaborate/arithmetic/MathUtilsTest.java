package com.capgemini.collaborate.arithmetic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Math Utils Test Sutie")
public class MathUtilsTest {
	
	MathUtils mathUtils = new MathUtils();

	@Test
	@DisplayName("Test for addition")
	void testAddition() {
		assertEquals(10, mathUtils.add(7, 3));
	}
}
