package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator test = new Calculator();
		int output = test.add(-4,-1);
		assertEquals(-5,output);
		int y = test.add(5, 3);
		assertEquals(8,y);
		int z = test.add(6,-2 );
		assertEquals(4,z);
		int f = test.add(0, 0);
		assertEquals(0,f);
	}

	@Test
	void testDivide() {
		Calculator test = new Calculator();
		float output = test.divide(2,5);
		assertEquals((float)2/5,output);
		float y = test.divide(0,5);
		assertEquals(0,y);
		float z = test.divide(10,5);
		assertEquals((float)10/5,z);
		assertThrows(ArithmeticException.class,()->test.divide(4, 0)); 
	}

}
