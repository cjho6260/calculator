package com.cjho6260.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**Test*/
public class CalculatorTest{
	private Calculator calculator = new Calculator();
	
	/*testSum*/
	@Test
	public void testSum(){
		assertEquals(5,calculator.sum(2,3));
	}

	/*testSub*/
	@Test
	public void testSub(){
		assertEquals(-1,calculator.sub(2,3));
	}
	
}
