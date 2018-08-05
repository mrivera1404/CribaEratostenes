/**
 * 
 */
package com.cenfotec.patrones.examen2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author mariajose
 *
 */
class CribaEratostenesTest {

	@Test
	void test() {
		int[] primos = new int[8];
		primos[0] = 2;
		primos[1] = 3;
		primos[2] = 5;
		primos[3] = 7;
		primos[4] = 11;
		primos[5] = 13;
		primos[6] = 17;
		primos[7] = 19;
		
		assertEquals(primos, CribaEratostenes.generaCriba(20));	
	}
}
