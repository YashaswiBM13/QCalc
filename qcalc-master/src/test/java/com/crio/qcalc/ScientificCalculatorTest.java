
package com.crio.qcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;

public class ScientificCalculatorTest {

	@Test
	void testAdd() {
		ScientificCalculator calc = new ScientificCalculator();
		calc.add(1d, 1d);
        assertEquals(2, calc.getResult());
    }
    
    @Test
    void testAddOverride() {
        ScientificCalculator scientificCalculator = Mockito.mock(ScientificCalculator.class);
        scientificCalculator.add(1d, 1d);
        verify(scientificCalculator).add(1f, 1f);
    }

	@Test
	void testSubtract() {
		ScientificCalculator calc = new ScientificCalculator();
		calc.subtract(1, 1);
        assertEquals(0, calc.getResult());
    }
    
    @Test
    void testSubtractOverride() {
        ScientificCalculator scientificCalculator = Mockito.mock(ScientificCalculator.class);
        scientificCalculator.subtract(1d, 1d);
        verify(scientificCalculator).subtract(1f, 1f);
    }

	@Test
	void testMultiply() {
		ScientificCalculator calc = new ScientificCalculator();
		calc.multiply(1, 1);
        assertEquals(1, calc.getResult());
    }
    
    @Test
    void testMultiplyOverride() {
        ScientificCalculator scientificCalculator = Mockito.mock(ScientificCalculator.class);
        scientificCalculator.multiply(1d, 1d);
        verify(scientificCalculator).multiply(1f, 1f);
    }

	@Test
	void testDivide() {
		ScientificCalculator calc = new ScientificCalculator();
		calc.divide(3, 2);
		assertEquals(1.5, calc.getResult());

		calc.divide(2, 3);
        assertEquals(2d/3d, calc.getResult());
    }
    
    @Test
    void testDivideOverride() {
        ScientificCalculator scientificCalculator = Mockito.mock(ScientificCalculator.class);
        scientificCalculator.divide(1d, 1d);
        verify(scientificCalculator).divide(1f, 1f);
    }

	@Test
	void testAdditionOverflow() {
		ScientificCalculator calc = new ScientificCalculator();
		assertThrows(ArithmeticException.class, new Executable(){
			@Override
			public void execute() throws Throwable {
				calc.add(Integer.MAX_VALUE, 1);
			}
		});
	}

	@Test
	void testResult() {
		ScientificCalculator calc = new ScientificCalculator();
		calc.add(1, 1);
		calc.subtract(1, 1);
		assertEquals(0, calc.getResult());
	}

	@Test
	void testPow(){
		ScientificCalculator calc = new ScientificCalculator();
		calc.pow(5,2);
		assertEquals(25, calc.getResult());
	}

}

