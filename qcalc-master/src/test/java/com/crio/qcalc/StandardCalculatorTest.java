package com.crio.qcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class StandardCalculatorTest {

	// private static int ans=0;
	@Test
	void testAdditionOverflow() {
		StandardCalculator calc = new StandardCalculator();
		assertThrows(ArithmeticException.class, new Executable(){
			@Override
			public void execute() throws Throwable {
				calc.add(Integer.MAX_VALUE, 1);
			}
		});
	}
	

	@Test
	void testAdd(){
		StandardCalculator sCalculator = new StandardCalculator();
		sCalculator.add(3,1);
		// System.out.println("Sum : "+sCalculator.getResult());
		// ans = sCalculator.getResult();
		assertEquals(4, sCalculator.getResult());
	}

	@Test
	void testSubtract(){
		StandardCalculator sCalculator = new StandardCalculator();
		sCalculator.subtract(7, 2);
		// ans = sCalculator.getResult();
		assertEquals(5, sCalculator.getResult());
	}
	@Test
	void testMultiply() {
		StandardCalculator calc = new StandardCalculator();
		calc.multiply(1, 1);
        assertEquals(1, calc.getResult());
    }

	@Test
	void testDivide() {
		StandardCalculator calc = new StandardCalculator();
		calc.divide(3, 2);
		assertEquals(1.5, calc.getResult());

		calc.divide(2, 3);
        assertEquals(2d/3d, calc.getResult());
    }

	@Test
	void testResult(){
		StandardCalculator cal = new StandardCalculator();
		// System.out.println("ans : "+ans);
		// System.out.println("result in testResult method "+cal.getResult());
		// assertEquals(ans,cal.getResult());
		cal.add(1, 1);
		cal.subtract(5, 3);
		assertEquals(2,cal.getResult());
	}


}

